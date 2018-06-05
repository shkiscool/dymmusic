package com.shk.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import com.shk.entity.mUser;

/**
 * �û��ļ���������ֹ�û��ظ���¼��
 * 
 * @author Administrator
 *
 */
@WebListener
public class Listener implements HttpSessionAttributeListener {


	public static Map<String, HttpSession> loginUser = new HashMap<String, HttpSession>();  
	  
    // �������Ϊsession�е�key  
    public static String SESSION_LOGIN_NAME = "users"; 
    /**
     * Default constructor. 
     */
    public Listener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     * ���û���Map����������û�������������Ƴ�����ӣ�
     * 
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	if (se.getName().equals(SESSION_LOGIN_NAME)) {  
    		  
    		mUser u = (mUser) se.getValue();  
            HttpSession session = loginUser.remove(u.getUSER_NAME());  
            if (session != null) {  
                session.removeAttribute("users");  
            }  
            loginUser.put(u.getUSER_NAME(), se.getSession());  
        } 
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     * ���û���Map������ɾ���û�
     * 
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	if (se.getName().equals(SESSION_LOGIN_NAME)) {  
            try {  
            	mUser u = (mUser) se.getSession().getAttribute("users");  
                loginUser.remove(u.getUSER_NAME());  
            } catch (Exception e) {  
                  
            }  
        }
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     * ���û���Map�������滻�û�
     * 
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	if (se.getName().equals(SESSION_LOGIN_NAME)) {  
    		  
    		mUser u = (mUser) se.getValue();  
            loginUser.remove(u.getUSER_NAME());   
            loginUser.put(u.getUSER_NAME(), se.getSession());  
        }  
    }
	
}
