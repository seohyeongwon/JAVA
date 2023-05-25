package org.com.ch15old;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ch15ex02client {
	private Socket socket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	public ch15ex02client() {
		try {
			socket = new Socket("127.0.0.1", 8000);
			System.out.println(">>>>>> 서버에 연결 됨");

			dataInputStream = new DataInputStream(socket.getInputStream());
			dataOutputStream = new DataOutputStream(socket.getOutputStream());

			dataOutputStream.writeUTF("Hello socket server!");
			System.out.println(dataInputStream.readUTF());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 실행 완료 후 모든 소켓 스트림 close.
			try {
				if (dataInputStream != null)
					dataInputStream.close();
				if (dataOutputStream != null)
					dataOutputStream.close();
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch15ex02client();
	}

}
