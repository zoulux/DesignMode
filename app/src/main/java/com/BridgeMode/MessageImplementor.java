package com.BridgeMode;

public interface MessageImplementor {
	/**
	 * ������Ϣ
	 * 
	 * @param message
	 *            Ҫ������Ϣ������
	 * @param toUser
	 *            ��Ϣ�Ľ�����
	 */
	public void send(String message, String toUser);
}
