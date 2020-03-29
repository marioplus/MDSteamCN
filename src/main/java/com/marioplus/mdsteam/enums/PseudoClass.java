package com.marioplus.mdsteam.enums;

/**
 * 伪类
 *
 * @author xianglei
 * @date 2020/1/2 14:41
 **/
public enum PseudoClass {

    BEFORE(":before"),
    AFTER(":after"),

    LINK(":link"),
    VISITED(":visited"),
    HOVER(":hover"),
    ACTIVE(":active"),
    FOCUS(":focus"),

    BEFORE_LINK(":before:link"),
    BEFORE_VISITED(":before:visited"),
    BEFORE_HOVER(":before:hover"),
    BEFORE_ACTIVE(":before:active"),
    BEFORE_FOCUS(":before:focus"),

    LINK_BEFORE(":link:before"),
    VISITED_BEFORE(":visited:before"),
    HOVER_BEFORE(":hover:before"),
    ACTIVE_BEFORE(":active:before"),
    FOCUS_BEFORE(":focus:before"),

    AFTER_LINK(":after:link"),
    AFTER_VISITED(":after:visited"),
    AFTER_HOVER(":after:hover"),
    AFTER_ACTIVE(":after:active"),
    AFTER_FOCUS(":after:focus"),

    LINK_AFTER(":link:after"),
    VISITED_AFTER(":visited:after"),
    HOVER_AFTER(":hover:after"),
    ACTIVE_AFTER(":active:after"),
    FOCUS_AFTER(":focus:after"),
    ;

    public String code;

    PseudoClass(String code) {
        this.code = code;
    }

}
