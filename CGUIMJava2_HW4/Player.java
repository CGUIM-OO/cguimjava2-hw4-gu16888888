import java.util.ArrayList;

public class Player {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
	}	
	private String name;//�������
	private int chips;//����еĻI�a
	private int bet;//��Ҵ˾���ע�ĻI�a
	private ArrayList oneRoundCard;//���ƾֵĿ�
	public Player(String name, int chips){
		
	}//Player constructor������Player����r����Ҫ���������еĻI�a�ȃɂ�����
	
	public String getName(){
	//name��getter
	return name;
		}
	public int makeBet(){
	/*��ע���؂��AӋ��ע�ĻI�a
	������ע��һ��1Ԫ
	��
	bet=1;*/
	return bet;
	//ע�⣺Ҫ�z���Ƿ�߀���X���]�X�˾Ͳ������^�m��ע
	}
	public void setOneRoundCard(ArrayList cards){
	//�O�����ƾ����õ��Ŀ� setter
	//oneRoundCard=cards;
	}
	public boolean hitMe(){
	/*�Ƿ�Ҫ�ƣ��ǻ؂�true������Ҫ�Ƅt�؂�false
	���������l����16�c����Ҫ�ƣ�17�c���ϲ�Ҫ��
	��ʾ����oneRoundCard����*/
		boolean result=true;
		return result;//Ϲд��
	}
	public int getTotalValue(){
	//�؂����ƾ����õĿ��c���ӿ�
		return 0;
	}
	public int getCurrentChips(){
	//�؂���ҬF�лI�a
		return 0;
	}
	public void increaseChips (int diff){
	//��һI�a׃�ӣ�setter
	}
	public void sayHello(){
	//���Say Hello
	
	System.out.println("Hello, I am " + name + ".");
	System.out.println("I have " + chips + " chips.");}
}
