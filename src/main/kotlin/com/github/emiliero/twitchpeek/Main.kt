package com.github.emiliero.twitchpeek

import com.github.emiliero.twitchpeek.authentication.login

import discord4j.core.DiscordClient
import discord4j.core.DiscordClientBuilder
import discord4j.core.`object`.presence.Activity
import discord4j.core.`object`.presence.Presence


fun main(args: Array<String>) {
    val client: DiscordClient = DiscordClientBuilder(BuildConfig.TOKEN_KEY).build()

    login(client)

    client.login().block()
}
