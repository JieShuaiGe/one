package cn.com.webxml.test;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

/**  
 * ClassName:MyTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月18日 下午3:49:58 <br/>       
 */
public class MyTest {
    public static void main(String[] args) {
        MobileCodeWS mobileCodeWS =new MobileCodeWS();
        MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getMobileCodeWSSoap();

        String abc000 = mobileCodeWSSoap.getMobileCodeInfo("18907734", "");
		
        System.out.println(abc000);

    }
}
  
