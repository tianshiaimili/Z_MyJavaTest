package testxmpp;


import java.io.File;


import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.filetransfer.FileTransfer;
import org.jivesoftware.smackx.filetransfer.FileTransferManager;
import org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer;

/**
 * @author test
 *
 */
public class TestXmpp {

    /**
     * @param args
     */
    public static void main(String[] args){
        
        String user = "admin@example.com/spark";
        String host = "localhost";
        int port = 5222;
        String username = "admin";
        String password = "huyue52099";
        System.out.println("*************");
        ConnectionConfiguration config = new ConnectionConfiguration(host,port);
        System.out.println("config = "+config);
        config.setCompressionEnabled(true);
        config.setSASLAuthenticationEnabled(true);
        
        XMPPConnection connection = new XMPPConnection(config);
        
        try{
        	
         connection.connect();
         System.out.println("_______________");
         connection.login(username, password);
         
//         sendFile(user,getFile(),connection );
         sendTextMessage(user,connection);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error = "+e.getMessage());
        }finally{
            connection.disconnect();
        }
        

    }
    
    public static File getFile(){
        File file = new File("D:/test.jpg");
        return file;
    }

//发送文件
    public static void sendFile(String user,File file,XMPPConnection connection )  throws Exception{
    	System.out.println("******sendFile*****");
        FileTransferManager manager = new FileTransferManager(connection);
        OutgoingFileTransfer transfer = manager.createOutgoingFileTransfer(user);
        long timeOut = 10000;
        long sleepMin = 3000;
        long spTime = 0;
        int rs = 0;  
       
            transfer.sendFile(file, "pls re file!");
            rs = transfer.getStatus().compareTo(FileTransfer.Status.complete);
            while(rs!=0){
                rs = transfer.getStatus().compareTo(FileTransfer.Status.complete);
                 spTime = spTime + sleepMin;
                 if(spTime>timeOut){return ;}
                Thread.sleep(sleepMin);
            }

    }

//发送文本
    public static void sendTextMessage(String user,XMPPConnection connection) throws Exception{
        System.out.println("*****sendTextMessage*********");
    	Chat chat = connection.getChatManager().createChat(user, new MessageListener() {
             
                public void processMessage(Chat chat, Message message) {
                    System.out.println("Received message: " + message);
                }
            });
            chat.sendMessage("Hi Test Send Message........!");
    }
    
  

}
