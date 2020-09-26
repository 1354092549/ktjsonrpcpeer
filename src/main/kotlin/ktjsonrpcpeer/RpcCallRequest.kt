package ktjsonrpcpeer

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
internal class RpcCallRequest(
        override val version: String?,
        override val method: String,
        override val params: JsonElement,
        val id: JsonElement
) : RpcRequest()