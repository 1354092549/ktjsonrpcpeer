package com.github.arcticlampyrid.ktjsonrpcpeer

public interface RpcMessageAdapter {
    public suspend fun readMessage(): ByteArray
    public suspend fun writeMessage(msg: ByteArray)
}