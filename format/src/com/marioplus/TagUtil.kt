package com.marioplus

//open class TagUtil {
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


fun String.toStringList(): List<String> {
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
 * 圆角按钮
 */
fun List<String>.mdRoundButton(base64img: String, size: Int = 46, imgSize: Int = -1): String {
    return arrayListOf(
            "${this.addPseudoClass()},",
            "${this.addPseudoClass(BEFORE)} {",
            "    width: ${size}px !important;",
            "    height: ${size}px !important;",
            "    border-radius: 50%;",
            "    position: relative;",
            "    transition: all .2s ease-in-out;",
            "}",

            "${this.addPseudoClass()} {",
            "    background-image: unset !important",
            "}",

            "${this.addPseudoClass(BEFORE)} {",
            "    content: '';",
            "    top: 0;",
            "    left: 0;",
            "    display: inline-block;",
            "    background-image: url('$base64img');",
            "    background-repeat: no-repeat;",
            "    background-position: center center;",
            if (imgSize < 0) "" else "background-size: $imgSize%;",
            "}",

            "${this.addPseudoClass(HOVER)} {",
            "    -webkit-box-shadow: 0 5px 5px -3px rgba(0, 0, 0, .2), 0 8px 10px 1px rgba(0, 0, 0, .14), 0 3px 14px 2px rgba(0, 0, 0, .12);",
            "    box-shadow: 0 5px 5px -3px rgba(0, 0, 0, .2), 0 8px 10px 1px rgba(0, 0, 0, .14), 0 3px 14px 2px rgba(0, 0, 0, .12);",
            "}"
    ).format()
}


