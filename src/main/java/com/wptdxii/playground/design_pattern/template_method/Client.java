package com.wptdxii.playground.design_pattern.template_method;

import com.wptdxii.playground.design_pattern.template_method.core.ClumsyMethod;
import com.wptdxii.playground.design_pattern.template_method.core.SubtleMethod;
import com.wptdxii.playground.design_pattern.template_method.core.Thief;

public class Client {

    public static void main(String[] args) {
        Thief thief = new Thief(new ClumsyMethod());
        thief.steal();

        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
