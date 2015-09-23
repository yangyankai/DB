package shootbox.sqlite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.List;

import shootbox.sqlite.SQLiteDAO.SQLiteDBDAO;
import shootbox.sqlite.chat_match_friends_record_201508.ChatMatchFriendsRecord201508;
import shootbox.sqlite.chat_match_friends_record_201508.ChatMatchFriendsRecord201508DAO;
import shootbox.sqlite.info_user_ability.UserAbilityDAO;

public class MainActivity extends AppCompatActivity
{

	private ImageView mImageView;
	private SQLiteDBDAO m_sqliteDBDAO;

	// 提示属性

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mImageView= (ImageView) findViewById(R.id.image);
//		add();
//		find();
//      findAll();
//		update();
//		delete();

		UserAbilityDAO ChatMatchFriendsRecord201508DAO = new UserAbilityDAO(this);

		ChatMatchFriendsRecord201508DAO.close();


		finish();
	}


	private void add() {
		ChatMatchFriendsRecord201508DAO ChatMatchFriendsRecord201508DAO = new ChatMatchFriendsRecord201508DAO(this);
		ChatMatchFriendsRecord201508 infoChatMatchFriendsRecord201508=new ChatMatchFriendsRecord201508();

//		infoChatMatchFriendsRecord201508.cChannelID = "2";
//		infoChatMatchFriendsRecord201508.cSenderID = "2";
//		infoChatMatchFriendsRecord201508.cReceiverID = "3";
//		infoChatMatchFriendsRecord201508.tSendTime = "4";
//
//		infoChatMatchFriendsRecord201508.bIsSend = true;
//		infoChatMatchFriendsRecord201508.blobSendContent =ReadPicToBytes.read(this) ;
//		infoChatMatchFriendsRecord201508.bIsReceive = true;

		ChatMatchFriendsRecord201508DAO.Add(infoChatMatchFriendsRecord201508);
		ChatMatchFriendsRecord201508DAO.close();
	}

	private void findAll() {
		ChatMatchFriendsRecord201508DAO ChatMatchFriendsRecord201508DAO = new ChatMatchFriendsRecord201508DAO(this);
		ChatMatchFriendsRecord201508 infoChatMatchFriendsRecord201508 = new ChatMatchFriendsRecord201508();
		List<ChatMatchFriendsRecord201508> infoChatMatchFriendsRecord201508s;

//		infoChatMatchFriendsRecord201508.cChannelID = "2";
//		infoChatMatchFriendsRecord201508.cSenderID = "2";
//		infoChatMatchFriendsRecord201508.cReceiverID = "3";
//		infoChatMatchFriendsRecord201508.tSendTime = "4";
//
//		infoChatMatchFriendsRecord201508.bIsSend = true;
//		infoChatMatchFriendsRecord201508.blobSendContent =ReadPicToBytes.read(this) ;
		infoChatMatchFriendsRecord201508.bIsReceive = true;


		infoChatMatchFriendsRecord201508s = ChatMatchFriendsRecord201508DAO.GetAll(infoChatMatchFriendsRecord201508);
		infoChatMatchFriendsRecord201508s.toString();
		ChatMatchFriendsRecord201508DAO.close();

	}

	private void delete() {
		ChatMatchFriendsRecord201508DAO ChatMatchFriendsRecord201508DAO = new ChatMatchFriendsRecord201508DAO(this);
		ChatMatchFriendsRecord201508 infoChatMatchFriendsRecord201508 = new ChatMatchFriendsRecord201508();

//		infoChatMatchFriendsRecord201508.cChannelID = "1";
//		infoChatMatchFriendsRecord201508.cSenderID = "177";
//		infoChatMatchFriendsRecord201508.cReceiverID = "377";
//		infoChatMatchFriendsRecord201508.tSendTime = "-33";
//
//		infoChatMatchFriendsRecord201508.bIsSend = true;
//		infoChatMatchFriendsRecord201508.blobSendContent =ReadPicToBytes.read(this) ;
		infoChatMatchFriendsRecord201508.bIsReceive = true;

		try {
			int delData = ChatMatchFriendsRecord201508DAO.Del(infoChatMatchFriendsRecord201508);// 根据id删
		} catch (Exception e) {

			e.printStackTrace();
		}
		ChatMatchFriendsRecord201508DAO.close();
	}

	private void update() {
		ChatMatchFriendsRecord201508DAO ChatMatchFriendsRecord201508DAO = new ChatMatchFriendsRecord201508DAO(this);
		ChatMatchFriendsRecord201508 infoChatMatchFriendsRecord201508=new ChatMatchFriendsRecord201508();


		infoChatMatchFriendsRecord201508.cChannelID = "1";
		infoChatMatchFriendsRecord201508.cSenderID = "177";
		infoChatMatchFriendsRecord201508.cReceiverID = "377";
		infoChatMatchFriendsRecord201508.tSendTime = "477";

		infoChatMatchFriendsRecord201508.bIsSend = true;
		infoChatMatchFriendsRecord201508.blobSendContent =ReadPicToBytes.read(this) ;
		infoChatMatchFriendsRecord201508.bIsReceive = true;



		try {
			int updata = ChatMatchFriendsRecord201508DAO.Update(infoChatMatchFriendsRecord201508);// 根据id改
		} catch (Exception e) {
			e.printStackTrace();
		}
		ChatMatchFriendsRecord201508DAO.close();
	}

	private void find() {

		ChatMatchFriendsRecord201508DAO ChatMatchFriendsRecord201508DAO = new ChatMatchFriendsRecord201508DAO(this);
		ChatMatchFriendsRecord201508 infoChatMatchFriendsRecord201508 = new ChatMatchFriendsRecord201508();


		infoChatMatchFriendsRecord201508.cChannelID = "2";
		infoChatMatchFriendsRecord201508.cSenderID = "2";
		infoChatMatchFriendsRecord201508.cReceiverID = "3";
		infoChatMatchFriendsRecord201508.tSendTime = "4";

		infoChatMatchFriendsRecord201508.bIsSend = true;
//		infoChatMatchFriendsRecord201508.blobSendContent =ReadPicToBytes.read(this) ;
		infoChatMatchFriendsRecord201508.bIsReceive = true;


		ChatMatchFriendsRecord201508 infoChatMatchFriendsRecord2015081 =
				ChatMatchFriendsRecord201508DAO.GetOne(infoChatMatchFriendsRecord201508);//infoChatMatchFriendsRecord201508);

//		mImageView.setImageBitmap(ReadPicToBytes.Bytes2Bimap(infoChatMatchFriendsRecord2015081.blobSelfMood));
		ChatMatchFriendsRecord201508DAO.close();
	}



}
