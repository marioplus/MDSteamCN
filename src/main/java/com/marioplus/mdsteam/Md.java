package com.marioplus.mdsteam;

import com.marioplus.mdsteam.enums.PseudoClass;
import com.marioplus.mdsteam.enums.Shadow;
import lombok.ToString;

import javax.crypto.interfaces.PBEKey;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xianglei
 * @date 2020/1/2 15:30
 **/
public class Md {

    /**
     * 增加伪类
     */
    private static String addPseudoClass(String tag, PseudoClass... pcs) {

        String pseudoClassStr = Arrays.stream(pcs)
                .map(p -> p.code)
                .reduce(String::concat)
                .orElse("");

        return tag + pseudoClassStr;
    }

    /**
     * md 阴影
     *
     * @param level 等级
     * @return code
     */
    public static String shadow(int level) {
        return String.format("%s", Shadow.of(level));
    }

    /**
     * 浮动按钮
     */
    public static String btnRaised(List<String> tagList) {
        List<List<Style>> list = tagList.stream().map(tag -> Arrays.asList(
                Style.create(tag).addCode(
                        "position: relative;",
                        "display: inline-block;",
                        "overflow: hidden;",
                        "text-decoration: none;",
                        "vertical-align: top;",
                        "outline: 0;",
                        Md.shadow(2),
                        "transition: all .2s ease-in-out;"
                ),
                Style.create(Md.addPseudoClass(tag, PseudoClass.HOVER)).addCode(
                        Md.shadow(4)
                ),
                Style.create(Md.addPseudoClass(tag, PseudoClass.ACTIVE)).addCode(
                        Md.shadow(8)
                ),
                Style.create(Md.addPseudoClass(tag, PseudoClass.BEFORE)).addCode(
                        "content: '';",
                        "width: 16px;",
                        "height: 16px;",
                        "display: inline-block;",
                        "position: relative;",
                        "top: 3px;",
                        "margin-right: 5px;",
                        "background: center no-repeat;",
                        "background-color: var(--color300);"
                )
        )).collect(Collectors.toList());
        return Md.format(list);
    }

    /**
     * 普通按钮
     */
    public static String btn(List<String> tagList) {
        List<List<Style>> list = tagList.stream().map(tag -> Arrays.asList(
                Style.create(tag).addCode(
                        "background: unset;",
                        "border-radius: 2px;",
                        "transition: all .2s ease-in-out;"
                ),
                Style.create(Md.addPseudoClass(tag, PseudoClass.HOVER)).addCode(
                        "background: rgba(0, 0, 0, .12);"
                ),
                Style.create(Md.addPseudoClass(tag, PseudoClass.ACTIVE)).addCode(
                        Md.shadow(6)
                ),
                Style.create(Md.addPseudoClass(tag, PseudoClass.BEFORE)).addCode(
                        "content: '';",
                        "width: 16px;",
                        "height: 16px;",
                        "display: inline-block;",
                        "position: relative;",
                        "top: 3px;",
                        "margin-right: 5px;",
                        "background: center no-repeat;",
                        "background-color: var(--color300);"
                )
        )).collect(Collectors.toList());
        return Md.format(list);
    }

    /**
     * 悬浮阴影
     */
    public static String hoverable(List<String> tagList) {
        List<List<Style>> list = tagList.stream().map(tag -> Arrays.asList(
                Style.create(tag).addCode(
                        "-webkit-transition: -webkit-box-shadow .25s cubic-bezier(.4, 0, .2, 1);",
                        "transition: -webkit-box-shadow .25s cubic-bezier(.4, 0, .2, 1);",
                        "transition: box-shadow .25s cubic-bezier(.4, 0, .2, 1);",
                        "transition: box-shadow .25s cubic-bezier(.4, 0, .2, 1), -webkit-box-shadow .25s cubic-bezier(.4, 0, .2, 1);",
                        "will-change: box-shadow;"
                ),
                Style.create(Md.addPseudoClass(tag, PseudoClass.FOCUS),
                        Md.addPseudoClass(tag, PseudoClass.HOVER)).addCode(
                        "background: rgba(0, 0, 0, .12);"
                )
        )).collect(Collectors.toList());
        return Md.format(list);
    }

    /**
     * 下划线
     */
    public static String typeA(List<String> tagList) {

        List<List<Style>> list = tagList.stream().map(tag -> Arrays.asList(
                Style.create(tag).addCode(
                        "position: relative;",
                        "display: inline-block;",
                        "overflow: hidden;",
                        "text-decoration: none;",
                        "vertical-align: top;",
                        "outline: 0;"
                ),
                Style.create(Md.addPseudoClass(tag, PseudoClass.BEFORE)).addCode(
                        "position: absolute;",
                        "top: auto;",
                        "bottom: 0;",
                        "left: 0;",
                        "width: 100%;",
                        "height: ${height}px;",
                        "content: ' ';",
                        "background-color: $color;",
                        "-webkit-transition: all .2s;",
                        "transition: all .2s;",
                        "-webkit-transform: scaleX(0);",
                        "transform: scaleX(0);",
                        "-webkit-backface-visibility: hidden;",
                        "backface-visibility: hidden;"
                ),
                Style.create(Md.addPseudoClass(tag, PseudoClass.FOCUS_BEFORE), Md.addPseudoClass(tag, PseudoClass.HOVER_BEFORE)).addCode(
                        "-webkit-transform: scaleX(1);",
                        "transform: scaleX(1);"
                )
        )).collect(Collectors.toList());
        return Md.format(list);
    }

    @ToString
    private static class Style {
        private List<String> tagList = new ArrayList<>();
        private List<String> codeList = new ArrayList<>();

        public static Style create() {
            return new Md.Style();
        }

        public static Style create(String tag) {
            return new Md.Style().addTag(tag);
        }

        public static Style create(List<String> tagList) {
            return new Md.Style().addTag(tagList);
        }

        public static Style create(String... tagList) {
            return new Md.Style().addTag(tagList);
        }

        public Style addTag(String tag) {
            this.tagList.add(tag);
            return this;
        }

        public Style addTag(List<String> tagList) {
            this.tagList.addAll(tagList);
            return this;
        }

        public Style addTag(String... tagList) {
            Arrays.stream(tagList)
                    .forEach(this::addTag);
            return this;
        }

        public Style addCode(String code) {
            this.codeList.add(code);
            return this;
        }

        public Style addCode(List<String> codeList) {
            this.codeList.addAll(codeList);
            return this;
        }

        public Style addCode(String... codeList) {
            Arrays.stream(codeList)
                    .forEach(this::addCode);
            return this;
        }

        public String format() {
            String tag = this.tagList.stream()
                    .reduce((t1, t2) -> t1 + ",\n" + t2)
                    .orElse("");
            String code = this.codeList.stream()
                    .reduce((t1, t2) -> t1 + "\n\t" + t2)
                    .orElse("");

            return String.format("%s {\n\t%s\n}", tag.trim(), code.trim());
        }
    }

    private static String format(List<List<Style>> styleList) {
        StringBuilder sb = new StringBuilder();
        for (List<Style> list : styleList) {
            for (Style style : list) {
                sb.append(style.format()).append("\n");
            }
        }
        return sb.toString();
    }
}
