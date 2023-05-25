package org.com.ch15old;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ch15ex01server {
	// ServerSocket <----> Socket 간의 통신 구현
	private ServerSocket serverSocket;
	private Socket clientSocket;

	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	public ch15ex01server() {
		// 1. 서버 소켓 준비(생성)
		// 2. 연결이 되면 클라이언트 소켓 반환(accept)

		try {
			serverSocket = new ServerSocket(8000);
			System.out.println("서버 소켓 대기 중 ...");
			clientSocket = serverSocket.accept();
			System.out.println(">>>> 크라이언트 연결 됨 : " + clientSocket.getLocalAddress());

			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());

			String msg = dataInputStream.readUTF();
			System.out.println(">>>> 클라이언트가 보낸 메세지: " + msg);
			dataOutputStream.writeUTF(msg);
			System.out.println(">>>> 클라이언트에 메세지 보내기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 실행 완료 후 모든 소켓 스트림 close.
			try {
				if (dataInputStream != null)dataInputStream.close();
				if (dataOutputStream != null)dataOutputStream.close();
				if (clientSocket != null)clientSocket.close();
				if (serverSocket != null)serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch15ex01server();
	}

}
