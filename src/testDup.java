import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class testDup {

	/**
	 * @param args
	 * @throws java.io.IOException
	 * 
	 */
	
	public ArrayList<String> testPlayer() throws IOException
	{
		ArrayList<String> playerList = new	ArrayList<String>();
		boolean flag = true;		
		while(flag)
		{	
			System.out.println("��������ұ��...");
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(
					System.in));
			String inputStr = buffer.readLine();
			int inputNum = inputStr.length();
			boolean [] playerExist = new boolean[4];
			char [] playerNum ;	
			Pattern numCompare = Pattern.compile("[1-4]*");
						
			if (!numCompare.matcher(inputStr).matches()) {
				System.out.println("���������ұ���зǷ��ַ�����������ȷ����ұ�ţ�");
				continue;
			}

			if (inputNum < 2 || inputNum > 4) {
				System.out.println("������������Ŀ���ԣ���ѡ��2λ��4λ��ң�");
				continue;
			}		
			
			playerNum = inputStr.toCharArray();
			for(int i=0; i<playerNum.length; i++)
			{				
				if(playerNum[i]=='1')
				{
					if(playerExist[0])//˵���Ѵ���
					{
						System.out.println("���������ұ�������ظ���\"1\",����������...");
						playerExist[0] = false;
						continue;
					}
					else
						playerExist[0] = true;
				}					
				else if(playerNum[i]=='2')
				{
					if(playerExist[1])//˵���Ѵ���
					{
						System.out.println("���������ұ�������ظ���\"2\",����������...");
						playerExist[1] = false;
						continue;
					}
					else
					{
						playerExist[1] = true;							
					}
				}
					
				else if(playerNum[i]=='3')
				{
					if(playerExist[2])//˵���Ѵ���
					{
						System.out.println("���������ұ�������ظ���\"3\",����������...");
						playerExist[2] = false;
						continue;
					}
					else
						playerExist[2] = true;
				}
				
				else if(playerNum[i]=='4')
				{
					if(playerExist[3])//˵���Ѵ���
					{
						System.out.println("���������ұ�������ظ���\"4\",����������...");
						playerExist[3] = false;
						continue;
					}
					else
						playerExist[3] = true;
				}				
				
			}
			if(!playerExist[0] && !playerExist[1] && !playerExist[2] && !playerExist[3])
				continue;
			else
			{
				System.out.println("���������ұ�����ǣ�");
				for(int j=0; j<playerNum.length; j++)
				{
					System.out.print(playerNum[j]+" ");					
					playerList.add(String.valueOf(playerNum[j]));
				}					
				flag = false;
			}
		}		
		return playerList;
		
	}
			
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		testDup tt = new testDup();
		tt.testPlayer();
	}

}
