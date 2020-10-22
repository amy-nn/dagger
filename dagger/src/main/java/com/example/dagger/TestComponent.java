package com.example.dagger;

import dagger.Component;

/**
 * 此为程序的入口
 * 使用component来标注
 */
@Component(modules = TestModule.class)
public interface TestComponent {

    void inject(Main2Activity main2Activity);
}
