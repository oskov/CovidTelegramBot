package com.warlodya.covidbot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.abilitybots.api.toggle.AbilityToggle;
import org.telegram.abilitybots.api.toggle.CustomToggle;

@Configuration
public class BotConfiguration {

    @Bean(name = "CovidBotToggle")
    public AbilityToggle getCovidBotToggle() {
        return new CustomToggle()
                .turnOff("promote")
                .turnOff("demote")
                .turnOff("ban")
                .turnOff("unban")
                .turnOff("claim")
                .turnOff("backup")
                .turnOff("recover");
    }
}
