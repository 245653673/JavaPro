package privateProtocl.code;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import privateProtocl.bean.NettyMessage;

import java.util.List;

public class NettyMessageEncoder extends MessageToMessageEncoder<NettyMessage>{
    private MarshallingEncoder marshallingEncoder;

    public NettyMessageEncoder(){
        this.marshallingEncoder = new MarshallingEncoder();
    }
    protected void encode(ChannelHandlerContext ctx, NettyMessage msg, List<Object> out) throws Exception {
        if(msg == null || msg.getHeader()==null)
            throw new Exception("The encode message is null");
        ByteBuf sendBuf = Unpooled.buffer();
        sendBuf.writeInt(msg.getHeader().getCrcCode());
        sendBuf.writeInt(msg.getHeader().getLength());
        sendBuf.writeLong(msg.getHeader().getSessionID());
        sendBuf.writeByte(msg.getHeader().getPriority());
        sendBuf.writeInt(msg.getHeader().getAttachment().size());























    }
}
