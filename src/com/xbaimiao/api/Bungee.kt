package com.xbaimiao.api

import com.xbaimiao.Main
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.io.ByteArrayOutputStream
import java.io.DataOutputStream
import java.io.IOException

object Bungee {

	init {
		if (!Bukkit.getMessenger().isOutgoingChannelRegistered(Main.plugin(), "BungeeCord")){
			Bukkit.getMessenger().registerOutgoingPluginChannel(Main.plugin(), "BungeeCord")
		}
	}

	@JvmStatic
	fun connect(player: Player, server: String) = sendBungeeData(player, "Connect", server)

	private fun sendBungeeData(player: Player, vararg args: String) {
		val byteArray = ByteArrayOutputStream()
		val out = DataOutputStream(byteArray)
		for (arg in args) {
			try {
				out.writeUTF(arg)
			} catch (e: IOException) {
				e.printStackTrace()
			}
		}
		player.sendPluginMessage(Main.plugin(), "BungeeCord", byteArray.toByteArray())
	}

}