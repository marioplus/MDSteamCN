package com.marioplus.mdsteam;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author xianglei
 * @date 2020/1/2 18:11
 **/
public class Main {
    public static void main(String[] args) {
//        System.out.println(Md.btn(Arrays.asList("#postsubmit")));
//        System.out.println(Md.btnRaised(Arrays.asList("#postsubmit")));
//        System.out.println(Md.shadow(3));
        System.out.println(Md.typeA(Collections.singletonList("#steam_monitor a"),2,"var(--color500)"));
    }
}
