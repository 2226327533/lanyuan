package test;
import java.lang.*;
public class getErrorInfo{
	
	public String getErrorInfo(String result, String resultDesc){
	String retInfo = "";
	int a;
	int b;
	if (!"".equals(result)) 
	{
		a = Integer.parseInt(result);
	}else{
		a = 0;
	}
	if(!"".equals(resultDesc)){
	b = Integer.parseInt(resultDesc);
	}else{
		b = 0;
	}	

	if(a == 1){
		retInfo ="֧���ɹ�";
		return retInfo;
	}
	else
		{
			switch(b){
				case 0:
					retInfo = "��ֵʧ��";
					break;
				case 1:
					retInfo = "ϵͳ����";
					break;
				case 2:
					retInfo = "������ʱ";
					break;
				case 11:
					retInfo = "ϵͳά��";
					break;
				case 12:
					retInfo = "��Ч�̻�";
					break;
				case 13:
					retInfo = "����";
					break;
				case 14:
					retInfo = "����֧���޶�";
					break;
				case 15:
					retInfo = "���Ż��ܴ���";
					break;
				case 16:
					retInfo = "���Ϸ���IP��ַ";
					break;
				case 17:
					retInfo = "�ظ���������";
					break;
				case 18:
					retInfo = "�����ѱ�ʹ��";
					break;
				case 19:
					retInfo = "����������";
					break;
				case 20:
					retInfo = "֧�������ʹ���";
					break;
				case 21:
					retInfo = "����������";
					break;
				case 22:
					retInfo = "����Ϣ������";
					break;
				case 23:
					retInfo = "���ţ����ܣ�����ȷ";
					break;
				case 24:
					retInfo = "�����ô˿�����������";
					break;
				case 25:
					retInfo = "������Ч";
					break;
				case 26:
					retInfo = "����Ч";
					break;
				default:
					retInfo = "֧��ʧ��";
					break;
				}

				return retInfo;
			}
		}
public static void main(String agrs[]) {
	getErrorInfo m = new getErrorInfo();
	System.out.println("result=24;resultDesc=0024:"+m.getErrorInfo("24","0024"));
	System.out.println("result=1;resultDesc=0000:"+m.getErrorInfo("1","0000"));
	System.out.println("result=33;resultDesc=0033:"+m.getErrorInfo("33","0033"));
	System.out.println("result=2;resultDesc=0002:"+m.getErrorInfo("2","0002"));
	System.out.println("result= ;resultDesc=:"+m.getErrorInfo("",""));

	}
}
