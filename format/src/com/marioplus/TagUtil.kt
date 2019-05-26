package com.marioplus

// region 伪类元素
const val BEFORE = ":before"
const val AFTER = ":after"

/**
 * 伪类
 */
const val LINK = ":link"
const val VISITED = ":visited"
const val HOVER = ":hover"
const val ACTIVE = ":active"
const val FOCUS = ":focus"

/**
 * 组合
 */
const val BEFORE_LINK = ":before:link"
const val BEFORE_VISITED = ":before:visited"
const val BEFORE_HOVER = ":before:hover"
const val BEFORE_ACTIVE = ":before:active"
const val BEFORE_FOCUS = ":before:focus"

const val LINK_BEFORE = ":link:before"
const val VISITED_BEFORE = ":visited:before"
const val HOVER_BEFORE = ":hover:before"
const val ACTIVE_BEFORE = ":active:before"
const val FOCUS_BEFORE = ":focus:before"

const val AFTER_LINK = ":after:link"
const val AFTER_VISITED = ":after:visited"
const val AFTER_HOVER = ":after:hover"
const val AFTER_ACTIVE = ":after:active"
const val AFTER_FOCUS = ":after:focus"

const val LINK_AFTER = ":link:after"
const val VISITED_AFTER = ":visited:after"
const val HOVER_AFTER = ":hover:after"
const val ACTIVE_AFTER = ":active:after"
const val FOCUS_AFTER = ":focus:after"
// endregion

// region 阴影
const val SHADOW_WEBKIT_NONE = "   -webkit-box-shadow: none;"
const val SHADOW_NONE = "   box-shadow: none;"
const val SHADOW_WEBKIT_1 = "   -webkit-box-shadow: 0 2px 1px -1px rgba(0, 0, 0, .2), 0 1px 1px 0 rgba(0, 0, 0, .14), 0 1px 3px 0 rgba(0, 0, 0, .12);"
const val SHADOW_1 = "   box-shadow: 0 2px 1px -1px rgba(0, 0, 0, .2), 0 1px 1px 0 rgba(0, 0, 0, .14), 0 1px 3px 0 rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_2 = "   -webkit-box-shadow: 0 3px 1px -2px rgba(0, 0, 0, .2), 0 2px 2px 0 rgba(0, 0, 0, .14), 0 1px 5px 0 rgba(0, 0, 0, .12);"
const val SHADOW_2 = "   box-shadow: 0 3px 1px -2px rgba(0, 0, 0, .2), 0 2px 2px 0 rgba(0, 0, 0, .14), 0 1px 5px 0 rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_3 = "   -webkit-box-shadow: 0 3px 3px -2px rgba(0, 0, 0, .2), 0 3px 4px 0 rgba(0, 0, 0, .14), 0 1px 8px 0 rgba(0, 0, 0, .12);"
const val SHADOW_3 = "   box-shadow: 0 3px 3px -2px rgba(0, 0, 0, .2), 0 3px 4px 0 rgba(0, 0, 0, .14), 0 1px 8px 0 rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_4 = "   -webkit-box-shadow: 0 2px 4px -1px rgba(0, 0, 0, .2), 0 4px 5px 0 rgba(0, 0, 0, .14), 0 1px 10px 0 rgba(0, 0, 0, .12);"
const val SHADOW_4 = "   box-shadow: 0 2px 4px -1px rgba(0, 0, 0, .2), 0 4px 5px 0 rgba(0, 0, 0, .14), 0 1px 10px 0 rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_5 = "   -webkit-box-shadow: 0 3px 5px -1px rgba(0, 0, 0, .2), 0 5px 8px 0 rgba(0, 0, 0, .14), 0 1px 14px 0 rgba(0, 0, 0, .12);"
const val SHADOW_5 = "   box-shadow: 0 3px 5px -1px rgba(0, 0, 0, .2), 0 5px 8px 0 rgba(0, 0, 0, .14), 0 1px 14px 0 rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_6 = "   -webkit-box-shadow: 0 3px 5px -1px rgba(0, 0, 0, .2), 0 6px 10px 0 rgba(0, 0, 0, .14), 0 1px 18px 0 rgba(0, 0, 0, .12);"
const val SHADOW_6 = "   box-shadow: 0 3px 5px -1px rgba(0, 0, 0, .2), 0 6px 10px 0 rgba(0, 0, 0, .14), 0 1px 18px 0 rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_7 = "   -webkit-box-shadow: 0 4px 5px -2px rgba(0, 0, 0, .2), 0 7px 10px 1px rgba(0, 0, 0, .14), 0 2px 16px 1px rgba(0, 0, 0, .12);"
const val SHADOW_7 = "   box-shadow: 0 4px 5px -2px rgba(0, 0, 0, .2), 0 7px 10px 1px rgba(0, 0, 0, .14), 0 2px 16px 1px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_8 = "   -webkit-box-shadow: 0 5px 5px -3px rgba(0, 0, 0, .2), 0 8px 10px 1px rgba(0, 0, 0, .14), 0 3px 14px 2px rgba(0, 0, 0, .12);"
const val SHADOW_8 = "   box-shadow: 0 5px 5px -3px rgba(0, 0, 0, .2), 0 8px 10px 1px rgba(0, 0, 0, .14), 0 3px 14px 2px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_9 = "   -webkit-box-shadow: 0 5px 6px -3px rgba(0, 0, 0, .2), 0 9px 12px 1px rgba(0, 0, 0, .14), 0 3px 16px 2px rgba(0, 0, 0, .12);"
const val SHADOW_9 = "   box-shadow: 0 5px 6px -3px rgba(0, 0, 0, .2), 0 9px 12px 1px rgba(0, 0, 0, .14), 0 3px 16px 2px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_10 = "   -webkit-box-shadow: 0 6px 6px -3px rgba(0, 0, 0, .2), 0 10px 14px 1px rgba(0, 0, 0, .14), 0 4px 18px 3px rgba(0, 0, 0, .12);"
const val SHADOW_10 = "   box-shadow: 0 6px 6px -3px rgba(0, 0, 0, .2), 0 10px 14px 1px rgba(0, 0, 0, .14), 0 4px 18px 3px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_11 = "   -webkit-box-shadow: 0 6px 7px -4px rgba(0, 0, 0, .2), 0 11px 15px 1px rgba(0, 0, 0, .14), 0 4px 20px 3px rgba(0, 0, 0, .12);"
const val SHADOW_11 = "   box-shadow: 0 6px 7px -4px rgba(0, 0, 0, .2), 0 11px 15px 1px rgba(0, 0, 0, .14), 0 4px 20px 3px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_12 = "   -webkit-box-shadow: 0 7px 8px -4px rgba(0, 0, 0, .2), 0 12px 17px 2px rgba(0, 0, 0, .14), 0 5px 22px 4px rgba(0, 0, 0, .12);"
const val SHADOW_12 = "   box-shadow: 0 7px 8px -4px rgba(0, 0, 0, .2), 0 12px 17px 2px rgba(0, 0, 0, .14), 0 5px 22px 4px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_13 = "   -webkit-box-shadow: 0 7px 8px -4px rgba(0, 0, 0, .2), 0 13px 19px 2px rgba(0, 0, 0, .14), 0 5px 24px 4px rgba(0, 0, 0, .12);"
const val SHADOW_13 = "   box-shadow: 0 7px 8px -4px rgba(0, 0, 0, .2), 0 13px 19px 2px rgba(0, 0, 0, .14), 0 5px 24px 4px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_14 = "   -webkit-box-shadow: 0 7px 9px -4px rgba(0, 0, 0, .2), 0 14px 21px 2px rgba(0, 0, 0, .14), 0 5px 26px 4px rgba(0, 0, 0, .12);"
const val SHADOW_14 = "   box-shadow: 0 7px 9px -4px rgba(0, 0, 0, .2), 0 14px 21px 2px rgba(0, 0, 0, .14), 0 5px 26px 4px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_15 = "   -webkit-box-shadow: 0 8px 9px -5px rgba(0, 0, 0, .2), 0 15px 22px 2px rgba(0, 0, 0, .14), 0 6px 28px 5px rgba(0, 0, 0, .12);"
const val SHADOW_15 = "   box-shadow: 0 8px 9px -5px rgba(0, 0, 0, .2), 0 15px 22px 2px rgba(0, 0, 0, .14), 0 6px 28px 5px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_16 = "   -webkit-box-shadow: 0 8px 10px -5px rgba(0, 0, 0, .2), 0 16px 24px 2px rgba(0, 0, 0, .14), 0 6px 30px 5px rgba(0, 0, 0, .12);"
const val SHADOW_16 = "   box-shadow: 0 8px 10px -5px rgba(0, 0, 0, .2), 0 16px 24px 2px rgba(0, 0, 0, .14), 0 6px 30px 5px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_17 = "   -webkit-box-shadow: 0 8px 11px -5px rgba(0, 0, 0, .2), 0 17px 26px 2px rgba(0, 0, 0, .14), 0 6px 32px 5px rgba(0, 0, 0, .12);"
const val SHADOW_17 = "   box-shadow: 0 8px 11px -5px rgba(0, 0, 0, .2), 0 17px 26px 2px rgba(0, 0, 0, .14), 0 6px 32px 5px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_18 = "   -webkit-box-shadow: 0 9px 11px -5px rgba(0, 0, 0, .2), 0 18px 28px 2px rgba(0, 0, 0, .14), 0 7px 34px 6px rgba(0, 0, 0, .12);"
const val SHADOW_18 = "   box-shadow: 0 9px 11px -5px rgba(0, 0, 0, .2), 0 18px 28px 2px rgba(0, 0, 0, .14), 0 7px 34px 6px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_19 = "   -webkit-box-shadow: 0 9px 12px -6px rgba(0, 0, 0, .2), 0 19px 29px 2px rgba(0, 0, 0, .14), 0 7px 36px 6px rgba(0, 0, 0, .12);"
const val SHADOW_19 = "   box-shadow: 0 9px 12px -6px rgba(0, 0, 0, .2), 0 19px 29px 2px rgba(0, 0, 0, .14), 0 7px 36px 6px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_20 = "   -webkit-box-shadow: 0 10px 13px -6px rgba(0, 0, 0, .2), 0 20px 31px 3px rgba(0, 0, 0, .14), 0 8px 38px 7px rgba(0, 0, 0, .12);"
const val SHADOW_20 = "   box-shadow: 0 10px 13px -6px rgba(0, 0, 0, .2), 0 20px 31px 3px rgba(0, 0, 0, .14), 0 8px 38px 7px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_21 = "   -webkit-box-shadow: 0 10px 13px -6px rgba(0, 0, 0, .2), 0 21px 33px 3px rgba(0, 0, 0, .14), 0 8px 40px 7px rgba(0, 0, 0, .12);"
const val SHADOW_21 = "   box-shadow: 0 10px 13px -6px rgba(0, 0, 0, .2), 0 21px 33px 3px rgba(0, 0, 0, .14), 0 8px 40px 7px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_22 = "   -webkit-box-shadow: 0 10px 14px -6px rgba(0, 0, 0, .2), 0 22px 35px 3px rgba(0, 0, 0, .14), 0 8px 42px 7px rgba(0, 0, 0, .12);"
const val SHADOW_22 = "   box-shadow: 0 10px 14px -6px rgba(0, 0, 0, .2), 0 22px 35px 3px rgba(0, 0, 0, .14), 0 8px 42px 7px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_23 = "   -webkit-box-shadow: 0 11px 14px -7px rgba(0, 0, 0, .2), 0 23px 36px 3px rgba(0, 0, 0, .14), 0 9px 44px 8px rgba(0, 0, 0, .12);"
const val SHADOW_23 = "   box-shadow: 0 11px 14px -7px rgba(0, 0, 0, .2), 0 23px 36px 3px rgba(0, 0, 0, .14), 0 9px 44px 8px rgba(0, 0, 0, .12);"
const val SHADOW_WEBKIT_24 = "   -webkit-box-shadow: 0 11px 15px -7px rgba(0, 0, 0, .2), 0 24px 38px 3px rgba(0, 0, 0, .14), 0 9px 46px 8px rgba(0, 0, 0, .12);"
const val SHADOW_24 = "   box-shadow: 0 11px 15px -7px rgba(0, 0, 0, .2), 0 24px 38px 3px rgba(0, 0, 0, .14), 0 9px 46px 8px rgba(0, 0, 0, .12);"
// endregion

fun String.toArray(): List<String> {
    return arrayListOf(this)
}

fun String.print() {
    println(this)
}

private fun String.addPseudoClass(pseudoClass: String): String {
    return this + pseudoClass
}

private fun List<String>.addPseudoClass(pseudoClass: String = ""): String {
    return this.map { t -> t.addPseudoClass(pseudoClass) }
            .reduce { s1, s2 -> "$s1,\n$s2" }
}

private fun List<String>.format(): String {
    return this.reduce { acc, s -> "$acc\n$s${if (s.contains("}")) "\n" else ""}" }
}

/**
 * 下划线
 */
fun List<String>.mdTypoA(color: String = "var(--white1)", height: Int = 2): String {
    return arrayListOf(
            "${this.addPseudoClass()} {",
            "   position: relative;",
            "   display: inline-block;",
            "   overflow: hidden;",
            "   text-decoration: none;",
            "   vertical-align: top;",
            "   outline: 0;",
            "}",

            "${this.addPseudoClass(BEFORE)} {",
            "   position: absolute;",
            "   top: auto;",
            "   bottom: 0;",
            "   left: 0;",
            "   width: 100%;",
            "   height: ${height}px;",
            "   content: ' ';",
            "   background-color: $color;",
            "   -webkit-transition: all .2s;",
            "   transition: all .2s;",
            "   -webkit-transform: scaleX(0);",
            "   transform: scaleX(0);",
            "   -webkit-backface-visibility: hidden;",
            "   backface-visibility: hidden;",
            "}",

            "${this.addPseudoClass(FOCUS_BEFORE)},\n${this.addPseudoClass(HOVER_BEFORE)} {",
            "   -webkit-transform: scaleX(1);",
            "   transform: scaleX(1);",
            "}"
    ).format()
}

/**
 * 悬浮阴影
 */

fun List<String>.mdHoverable(): String {
    return arrayListOf(
            "${this.addPseudoClass()} {",
            "   -webkit-transition: -webkit-box-shadow .25s cubic-bezier(.4, 0, .2, 1);",
            "   transition: -webkit-box-shadow .25s cubic-bezier(.4, 0, .2, 1);",
            "   transition: box-shadow .25s cubic-bezier(.4, 0, .2, 1);",
            "   transition: box-shadow .25s cubic-bezier(.4, 0, .2, 1), -webkit-box-shadow .25s cubic-bezier(.4, 0, .2, 1);",
            "   will-change: box-shadow;",
            "}",

            "${this.addPseudoClass(FOCUS)},",
            "${this.addPseudoClass(HOVER)} {",
            "   -webkit-box-shadow: 0 5px 5px -3px rgba(0, 0, 0, .2), 0 8px 10px 1px rgba(0, 0, 0, .14), 0 3px 14px 2px rgba(0, 0, 0, .12);",
            "   box-shadow: 0 5px 5px -3px rgba(0, 0, 0, .2), 0 8px 10px 1px rgba(0, 0, 0, .14), 0 3px 14px 2px rgba(0, 0, 0, .12);",
            "}"
    ).format()
}

/**
 * 按钮阴影效果
 */
fun List<String>.mdBtn(color: String = "var(--color500)"): String {
    return arrayListOf(
            "${this.addPseudoClass()} {",
            "   background: $color !important;",
            SHADOW_WEBKIT_2,
            SHADOW_2,
            "   transition: all .2s ease-in-out;",
            "}",

            "${this.addPseudoClass(HOVER)} {",
            SHADOW_WEBKIT_4,
            SHADOW_4,
            "}",

            "${this.addPseudoClass(ACTIVE)} {",
            SHADOW_WEBKIT_8,
            SHADOW_8,
            "}"
    ).format()
}

/**
 * 小型按钮
 */
fun List<String>.mdMsBtn(color: String = "var(--color500)"): String {
    return arrayListOf(
            "${this.addPseudoClass()} {",
            "   border-radius: 2px;",
            "   background: unset;",
            "   transition: all .2s ease-in-out;",
            "}",

            "${this.addPseudoClass(HOVER)} {",
            "   background: rgba(0, 0, 0, .2);",
            "}",

            "${this.addPseudoClass(ACTIVE)} {",
            "   background: var(--color500);",
            SHADOW_WEBKIT_4,
            SHADOW_4,
            "}"
    ).format()

}

/**
 * 生成阴影
 */
fun List<String>.mdShadow(level: Int): String {
    var base = ""
    var webkit = ""
    when (level) {
        1 -> {
            base = SHADOW_1
            webkit = SHADOW_WEBKIT_1
        }
        2 -> {
            base = SHADOW_2
            webkit = SHADOW_WEBKIT_2
        }
        3 -> {
            base = SHADOW_3
            webkit = SHADOW_WEBKIT_3
        }
        4 -> {
            base = SHADOW_4
            webkit = SHADOW_WEBKIT_4
        }
        5 -> {
            base = SHADOW_5
            webkit = SHADOW_WEBKIT_5
        }
        6 -> {
            base = SHADOW_6
            webkit = SHADOW_WEBKIT_6
        }
        7 -> {
            base = SHADOW_7
            webkit = SHADOW_WEBKIT_7
        }
        8 -> {
            base = SHADOW_8
            webkit = SHADOW_WEBKIT_8
        }
        9 -> {
            base = SHADOW_9
            webkit = SHADOW_WEBKIT_9
        }
        10 -> {
            base = SHADOW_10
            webkit = SHADOW_WEBKIT_10
        }
        11 -> {
            base = SHADOW_11
            webkit = SHADOW_WEBKIT_11
        }
        12 -> {
            base = SHADOW_12
            webkit = SHADOW_WEBKIT_12
        }
        13 -> {
            base = SHADOW_13
            webkit = SHADOW_WEBKIT_13
        }
        14 -> {
            base = SHADOW_14
            webkit = SHADOW_WEBKIT_14
        }
        15 -> {
            base = SHADOW_15
            webkit = SHADOW_WEBKIT_15
        }
        16 -> {
            base = SHADOW_16
            webkit = SHADOW_WEBKIT_16
        }
        17 -> {
            base = SHADOW_17
            webkit = SHADOW_WEBKIT_17
        }
        18 -> {
            base = SHADOW_18
            webkit = SHADOW_WEBKIT_18
        }
        19 -> {
            base = SHADOW_19
            webkit = SHADOW_WEBKIT_19
        }
        20 -> {
            base = SHADOW_20
            webkit = SHADOW_WEBKIT_20
        }
        21 -> {
            base = SHADOW_21
            webkit = SHADOW_WEBKIT_21
        }
        22 -> {
            base = SHADOW_22
            webkit = SHADOW_WEBKIT_22
        }
        23 -> {
            base = SHADOW_23
            webkit = SHADOW_WEBKIT_23
        }
        24 -> {
            base = SHADOW_23
            webkit = SHADOW_WEBKIT_23
        }
        else -> {
            base = SHADOW_NONE
            webkit = SHADOW_WEBKIT_NONE
        }
    }
    return arrayListOf(
            "${this.addPseudoClass()} {",
            webkit,
            base,
            "}"
    ).format()
}
