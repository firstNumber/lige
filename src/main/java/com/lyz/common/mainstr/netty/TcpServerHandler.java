package com.lyz.common.mainstr.netty;

import org.apache.log4j.Logger;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TcpServerHandler extends SimpleChannelInboundHandler<Object> {
	private static Logger logger = Logger.getLogger(TcpServerHandler.class);

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
		logger.info("SERVER接收到消息:" + msg);
		ctx.channel().writeAndFlush("server accepted msg:" + msg);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		logger.warn("exceptionCaught!", cause);
		ctx.close();
	}
}
