package com.example.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {

    @Provides
    public Job setJob(){
        return new Job();
    }
}
