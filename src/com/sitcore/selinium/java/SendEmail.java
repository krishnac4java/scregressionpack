package com.sitcore.selinium.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

public class SendEmail {

	private final static String username = "AutomationVJ@outlook.com";
	private final static String password = "Ovj4519oe26";
	private static List<String> userStories = new ArrayList<String>();
	private static List<String> inProgressuserStories = new ArrayList<String>();
	
	public static void main(String[] args) {

		sendEMail("No Subject", null);
	}
	
	@Test
	public void zSendEmail() {
		sendEMail("Automated_Regression_Pack", ObjectRepositoryMain.resultList);
	}

	public static void sendEMail(String subject, List<TestResultModel> resultList) {
		userStoriesAddition();
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp-mail.outlook.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.auth", "true"); 

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("AutomationVJ@outlook.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("AutomationVJ@outlook.com"));
			message.setSubject(subject);
			StringBuilder bodyBuilder = new StringBuilder();
			bodyBuilder.append("<html><head></head><title></title>");
			bodyBuilder.append("<body style='font-size:12px;font-family:Trebuchet MS;'>");
			bodyBuilder.append("<table width='600px' align='center'cellpadding='0' cellspacing='0' border='3'");
			/*private String loginName;
			private String methodName;
			private String accountName;
			private String contactName;
			private String opportunityName;
			private String product1;
			private String product2;
			private String testResult;*/
			bodyBuilder.append("<tr><td> Test Description</td><td> SDFC Object Name</td><td> Test Result</td></tr>");
			for(TestResultModel resultEachModel : resultList)
			{
				String color = "", cannot = "";
				if(resultEachModel.getTestResult().equals("Success"))
				{
					cannot = "can";
					color = "00FF00";
				}
				else
				{
					cannot = "CANNOT";
					color = "FF0000";
				}
					//FF0000"
				bodyBuilder.append("<tr><td> Verify "+resultEachModel.getLoginName()+" user "+cannot+" create an Account "+(resultEachModel.getAccountType()==null? "":resultEachModel.getAccountType())+" </td>"
						+ "<td> "+(resultEachModel.getAccountName()==null? "":resultEachModel.getAccountName())+"</td>"
						+ "<td bgcolor=\"#"+color+"\"> "+(resultEachModel.getTestResult()==null? "":resultEachModel.getTestResult())+"</td></tr>"
						
						+"<tr><td> Verify "+resultEachModel.getLoginName()+" user "+cannot+" create a Contact "+(resultEachModel.getContactType()==null? "":resultEachModel.getContactType())+" </td>"
						+ "<td> "+(resultEachModel.getContactName()==null? "":resultEachModel.getContactName())+"</td>"
						+ "<td bgcolor=\"#"+color+"\"> "+(resultEachModel.getTestResult()==null? "":resultEachModel.getTestResult())+"</td></tr>"
						
						+"<tr><td> Verify "+resultEachModel.getLoginName()+" user "
						+((resultEachModel.getOpportunityName()==null || resultEachModel.getOpportunityName().equals(""))? "CANNOT" : "can" )
						+" create an Opportunity </td>"
						+ "<td> "+(resultEachModel.getOpportunityName()==null? "":resultEachModel.getOpportunityName())+"</td>"
						+ "<td bgcolor=\"#"+color+"\"> "+(resultEachModel.getTestResult()==null? "":resultEachModel.getTestResult())+"</td></tr>"
						
						+"<tr><td> Verify "+resultEachModel.getLoginName()+" user "
						+((resultEachModel.getOpportunityName()==null || resultEachModel.getOpportunityName().equals(""))? "CANNOT" : "can" )
						+" create a Product </td>"
						+ "<td></td>"
						+ "<td bgcolor=\"#"+color+"\"> "+(resultEachModel.getTestResult()==null? "":resultEachModel.getTestResult())+"</td></tr>");
			}
			for(TestResultModel testResultModelResult : ObjectRepositoryMain.userStoryresultList) {
				String color = "";
				if(testResultModelResult.getTestResult().equals("Success"))
					color = "00FF00";
				else
					color = "FF0000";
				bodyBuilder.append("<tr><td> Verify "+testResultModelResult.getMethodName()+" </td>"
						+ "<td></td>"
						+ "<td bgcolor=\"#"+color+"\"> "+testResultModelResult.getTestResult()+" </td></tr>");
			}
			for(String userStory : inProgressuserStories) {
				bodyBuilder.append("<tr><td> Verify "+userStory+" </td>"
						+ "<td></td>"
						+ "<td> In Progress</td></tr>");
			}
			for(String userStory : userStories) {
				bodyBuilder.append("<tr><td> Verify "+userStory+" </td>"
						+ "<td></td>"
						+ "<td> No Run</td></tr>");
			}
			bodyBuilder.append("</table></body></html>");
			message.setContent(bodyBuilder.toString(), "text/html; charset=utf-8");
			createHTMLFile(bodyBuilder.toString());
			Transport.send(message);
			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	private static void createHTMLFile(String htmlContent) {
		SimpleDateFormat ssdf = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		Date fileDate = new Date();		
		FileWriter fWriter = null;
		BufferedWriter writer = null;
		try {
		    fWriter = new FileWriter(ObjectRepositoryMain.htmlReportPath+ssdf.format(fileDate)+".html");
		    writer = new BufferedWriter(fWriter);
		    writer.write(htmlContent);
		    writer.close(); //make sure you close the writer object 
		} catch (Exception e) {
		  //catch any exceptions here
		}
	}
	private static void userStoriesAddition() {
		userStories.add("MVP-Sprint1 - US-1169");
		userStories.add("MVP-Sprint1 - US-1169");
		userStories.add("MVP-Sprint1 - US-0699");
		userStories.add("MVP-Sprint1 - US-0677");
		userStories.add("MVP-Sprint1 - US-0948");
		userStories.add("MVP-Sprint1 - US-0478");
		userStories.add("MVP-Sprint1 - US-0634");
		userStories.add("MVP-Sprint1 - US-1102");
		userStories.add("MVP-Sprint1 - US-1095");
		userStories.add("MVP-Sprint1 - US-1096");
		userStories.add("MVP-Sprint1 - US-1091");
		userStories.add("MVP-Sprint1 - US-1099");
		userStories.add("MVP-Sprint1 - US-1101");
		userStories.add("MVP-Sprint1 - US-1079");
		userStories.add("MVP-Sprint2 - US-0949");
		userStories.add("MVP-Sprint2 - US-1144");
		userStories.add("MVP-Sprint2 - US-1151");
		userStories.add("MVP-Sprint2 - US-1146");
		userStories.add("MVP-Sprint2 - US-1123");
		userStories.add("MVP-Sprint2 - US-1121");
		userStories.add("MVP-Sprint2 - US-1154");
		userStories.add("MVP-Sprint2 - US-1161");
		userStories.add("MVP-Sprint2 - US-1156");
		userStories.add("MVP-Sprint2 - US-1167");
		userStories.add("MVP-Sprint2 - US-1139");
		userStories.add("MVP-Sprint2 - US-1165");
		userStories.add("MVP-Sprint2 - US-1143");
		userStories.add("MVP-Sprint2 - US-1125");
		userStories.add("MVP-Sprint2 - US-1127");
		userStories.add("MVP-Sprint2 - US-1164");
		userStories.add("MVP-Sprint2 - US-1171");
		userStories.add("MVP-Sprint2 - US-1093");
		userStories.add("MVP-Sprint2 - US-1098");
		userStories.add("MVP-Sprint2 - US-1085");
		userStories.add("MVP-Sprint2 - US-1097");
		userStories.add("MVP-Sprint2 - US-1081");
		userStories.add("MVP-Sprint2 - US-0563");
		userStories.add("MVP-Sprint2 - US-0566");
		inProgressuserStories.add("MVP-Sprint2 - US-0567");
		userStories.add("MVP-Sprint2 - US-0569");
		userStories.add("MVP-Sprint2 - US-0571");
		userStories.add("MVP-Sprint2 - US-0586");
		userStories.add("MVP-Sprint2 - US-0629");
		userStories.add("MVP-Sprint2 - US-0630");
		userStories.add("MVP-Sprint2 - US-0631");
		userStories.add("MVP-Sprint2 - US-0638");
		userStories.add("MVP-Sprint2 - US-0647");
		userStories.add("MVP-Sprint2 - US-0648");
		userStories.add("MVP-Sprint2 - US-0649");
		userStories.add("MVP-Sprint2 - US-0653");
		userStories.add("MVP-Sprint2 - US-0455");
		userStories.add("MVP-Sprint2 - US-0459");
		userStories.add("MVP-Sprint2 - US-0462");
		userStories.add("MVP-Sprint2 - US-0515");
		userStories.add("MVP-Sprint2 - US-0518");
		userStories.add("MVP-Sprint2 - US-0519");
		userStories.add("MVP-Sprint2 - US-0525");
		userStories.add("MVP-Sprint2 - US-0526");
		userStories.add("MVP-Sprint2 - US-0833");
		userStories.add("MVP-Sprint2 - US-0656");
		userStories.add("MVP-Sprint2 - US-0657");
		userStories.add("MVP-Sprint2 - US-0678");
		userStories.add("MVP-Sprint2 - US-0679");
		userStories.add("MVP-Sprint2 - US-0681");
		inProgressuserStories.add("MVP-Sprint2 - US-0691");
		inProgressuserStories.add("MVP-Sprint2 - US-1249");
		inProgressuserStories.add("MVP-Sprint2 - US-1283");
		inProgressuserStories.add("MVP-Sprint2 - US-1282");
		userStories.add("MVP-Sprint2 - US-0700");
		userStories.add("MVP-Sprint2 - US-0902");
		userStories.add("MVP-Sprint2 - US-0909");
		userStories.add("MVP-Sprint2 - US-1130");
		userStories.add("MVP-Sprint2 - US-1150");
		userStories.add("MVP-Sprint2 - US-1136");
		userStories.add("MVP-Sprint2 - US-1162");
		userStories.add("MVP-Sprint2 - US-1160");
		userStories.add("MVP-Sprint2 - US-1166");
		userStories.add("MVP-Sprint2 - US-1291");
		userStories.add("MVP-Sprint2 - US-1299");
		userStories.add("MVP-Sprint2 - US-1302");
		userStories.add("MVP-Sprint2 - US-1307");
		userStories.add("MVP-Sprint2 - US-1304");
		userStories.add("MVP-Sprint2 - US-0573");
		userStories.add("MVP-Sprint2 - US-0574");
		userStories.add("MVP-Sprint2 - US-1261");
		userStories.add("MVP-Sprint2 - US-1318");
		userStories.add("MVP-Sprint3 - US-1290");
		inProgressuserStories.add("MVP-Sprint3 - US-1595");
		userStories.add("MVP-Sprint3 - US-1351");
		userStories.add("MVP-Sprint3 - US-1286");
		userStories.add("MVP-Sprint3 - US-1344");
		userStories.add("MVP-Sprint3 - US-1287");
		userStories.add("MVP-Sprint3 - US-1280");
		userStories.add("MVP-Sprint3 - US-1238");
		userStories.add("MVP-Sprint3 - US-1239");
		userStories.add("MVP-Sprint3 - US-1257");
		userStories.add("MVP-Sprint3 - US-1269");
		userStories.add("MVP-Sprint3 - US-1274");
		userStories.add("MVP-Sprint3 - US-1245");
		userStories.add("MVP-Sprint3 - US-1298");
		userStories.add("MVP-Sprint3 - US-1300");
		userStories.add("MVP-Sprint3 - US-1301");
		userStories.add("MVP-Sprint3 - US-1305");
		userStories.add("MVP-Sprint3 - US-1306");
		userStories.add("MVP-Sprint3 - US-1308");
		userStories.add("MVP-Sprint3 - US-1309");
		userStories.add("MVP-Sprint3 - US-1310");
		userStories.add("MVP-Sprint3 - US-1311");
		userStories.add("MVP-Sprint3 - US-1312");
		userStories.add("MVP-Sprint3 - US-1313");
		userStories.add("MVP-Sprint3 - US-1314");
		userStories.add("MVP-Sprint3 - US-1315");
		userStories.add("MVP-Sprint3 - US-1316");
		userStories.add("MVP-Sprint3 - US-1317");
		userStories.add("MVP-Sprint3 - US-1603");
		userStories.add("MVP-Sprint3 - US-1084");
		userStories.add("MVP-Sprint3 - US-1148");
		userStories.add("MVP-Sprint3 - US-1217");
		userStories.add("MVP-Sprint3 - US-1234");
		userStories.add("MVP-Sprint3 - US-1219");
		userStories.add("MVP-Sprint3 - US-1222");
		userStories.add("MVP-Sprint3 - US-1226");
		userStories.add("MVP-Sprint3 - US-1218");
		userStories.add("MVP-Sprint3 - US-1231");
		userStories.add("MVP-Sprint3 - US-1225");
		userStories.add("MVP-Sprint3 - US-1224");
		userStories.add("MVP-Sprint3 - US-1229");
		userStories.add("MVP-Sprint3 - US-1230");
		userStories.add("MVP-Sprint3 - US-1220");
		userStories.add("MVP-Sprint3 - US-1228");
		userStories.add("MVP-Sprint3 - US-1227");
		userStories.add("MVP-Sprint3 - US-1221");
		userStories.add("MVP-Sprint3 - US-1152");
		userStories.add("MVP-Sprint3 - US-0580");
		userStories.add("MVP-Sprint3 - US-1216");
		userStories.add("MVP-Sprint3 - US-1215");
		userStories.add("MVP-Sprint3 - US-0760");
		userStories.add("MVP-Sprint3 - US-0761");
		userStories.add("MVP-Sprint3 - US-1078");
		userStories.add("MVP-Sprint3 - US-1189");
		userStories.add("MVP-Sprint3 - US-1163");
		userStories.add("MVP-Sprint3 - US-1158");
		userStories.add("MVP-Sprint3 - US-1188");
		userStories.add("MVP-Sprint3 - US-1183");
		userStories.add("MVP-Sprint3 - US-1190");
		userStories.add("MVP-Sprint3 - US-1233");
		userStories.add("MVP-Sprint3 - US-1182");
		userStories.add("MVP-Sprint3 - US-1184");
		userStories.add("MVP-Sprint3 - US-1212");
		userStories.add("MVP-Sprint3 - US-0468");
		userStories.add("MVP-Sprint3 - US-0471");
		userStories.add("MVP-Sprint3 - US-1159");
		userStories.add("MVP-Sprint3 - US-1157");
		userStories.add("MVP-Sprint3 - US-0690");
		userStories.add("MVP-Sprint3 - US-0692");
		userStories.add("MVP-Sprint3 - US-0693");
		userStories.add("MVP-Sprint3 - US-1187");
		userStories.add("MVP-Sprint3 - US-1186");
		userStories.add("MVP-Sprint3 - US-0530");
		userStories.add("MVP-Sprint3 - US-1191");
		userStories.add("MVP-Sprint3 - US-0655");
		userStories.add("MVP-Sprint3 - US-1019");
		userStories.add("MVP-Sprint3 - US-1173");
		userStories.add("MVP-Sprint3 - US-0531");

	}
}

