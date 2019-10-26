package com.marioplus

import java.io.File
import java.text.DateFormat
import java.util.*

enum class MatchMode(val key: String) {
    DOMAIN("domain"),
    URL("url"),
    URL_PREFIX("url-prefix"),
    REGEXP("regexp")
}

fun main() {
    val rootPath = System.getProperty("user.dir")
    val cssPath = "$rootPath\\stylish\\src\\"
    val exportPath = "$rootPath\\stylish\\userstyles\\main.css"
    val exportConfig = mapOf(
            // md颜色
            arrayOf("md颜色", "mdColor") to mapOf(
                    MatchMode.DOMAIN to setOf("keylol.com")
            ),
            // 变量配置
            arrayOf("变量配置", "var") to mapOf(
                    MatchMode.DOMAIN to setOf("keylol.com")
            ),
            // 导航栏
            arrayOf("导航栏", "nav") to mapOf(
                    MatchMode.DOMAIN to setOf("keylol.com")
            ),
            // 首页
            arrayOf("首页", "home") to mapOf(
                    MatchMode.URL to setOf("https://keylol.com/", "https://keylol.com/forum.php")
            ),
            // 帖子内容
            arrayOf("帖子内容", "post") to mapOf(
                    MatchMode.URL_PREFIX to setOf("https://keylol.com/t", "https://keylol.com/forum.php?mod=viewthread&t")
            ),
            // 板块
            arrayOf("板块（帖子列表）", "postList") to mapOf(
                    MatchMode.REGEXP to setOf(".+keylol.com/f[0-9]{3}.+", ".+keylol.com.+forumdisplay.+fid=[0-9]+.+")
            ),
            // 导读
            arrayOf("导读", "guide") to mapOf(
                    MatchMode.URL_PREFIX to setOf("http://keylol.com/forum.php?mod=guide", "https://keylol.com/forum.php?mod=guide")
            ),
            // 导读的“最新热门”、“最新回复”、“最新发表”、“我的帖子”
            arrayOf("导读的“最新热门”、“最新回复”、“最新发表”、“我的帖子”", "guide-new-hot-my") to mapOf(
                    MatchMode.URL_PREFIX to setOf("http://keylol.com/forum.php?mod=guide", "https://keylol.com/forum.php?mod=guide")
            ),
            // 导读的“最新热门”、“最新回复”、“最新发表”、“我的帖子”
            arrayOf("导读的“最新精华”、“抢沙发”", "guide-digest-sofa") to mapOf(
                    MatchMode.REGEXP to setOf(".+keylol.com.+mod=guide&view=(digest|sofa)")
            ),
            // 导读的“最新热门”、“最新回复”、“最新发表”、“我的帖子”
            arrayOf("导读的“我的帖子”", "guide-my") to mapOf(
                    MatchMode.REGEXP to setOf(".+keylol.com.+mod=guide&view=my")
            )

    )
    var exportCode = ""
    exportConfig.forEach {
        val comment = it.key[0]
        val cssFileName = it.key[1]
        exportCode += "/* \n"
        exportCode += " * $comment\n"
        exportCode += " * $cssFileName.css\n"
        exportCode += " */\n"

        var filterMatch = true
        exportCode += "@-moz-document "
        it.value.forEach { (mode, matchSet) ->
            matchSet.forEach { matchStr ->
                if (filterMatch) {
                    filterMatch = false
                } else {
                    exportCode += ", "
                }
                exportCode += "${mode.key}(\"$matchStr\")"
            }
            exportCode += " {\n"
            File("$cssPath$cssFileName.css").readLines()
                    .forEach { code -> exportCode += "\t$code\n" }
            exportCode += "}\n\n"
        }
    }

    File(exportPath).writeText(exportCode)
    println("${DateFormat.getDateTimeInstance().format(Date())}: 导出完成")
}