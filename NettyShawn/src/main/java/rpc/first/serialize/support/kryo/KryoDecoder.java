package rpc.first.serialize.support.kryo;


import rpc.first.serialize.support.MessageCodecUtil;
import rpc.first.serialize.support.MessageDecoder;

public class KryoDecoder extends MessageDecoder {

    public KryoDecoder(MessageCodecUtil util) {
        super(util);
    }
}
