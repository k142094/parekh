public class Main
{
	public static void main(String[] args)
	{
		Scanner stdin=new Scanner(System.in);
		String infix_temp= stdin.nextLine().replaceAll("\\-", "a").replaceAll("\\+", "b").replaceAll("\\*", "c").replaceAll("\\/", "d");
		String postfix=new String("");
		Stack operators=new Stack();
		char[] infix=infix_temp.toCharArray();
		System.out.println(infix);
		for(int i=0 ;i<infix.length;i++)
		{
			if(infix[i]=='('||infix[i]==')'||infix[i]=='a'||infix[i]=='b'||infix[i]=='c'||infix[i]=='d')
			{
				postfix=postfix+".";
				if(operators.empty()||(char)operators.peek()=='(')
				{
					operators.push(infix[i]);
				}
				else{
					if(infix[i]==')')
					{
						while((char)operators.peek()!='(')
						{
							postfix=postfix+(char)operators.pop()+'.';
						}
						operators.pop();
					}
					else{
						if(infix[i]>(char)operators.peek()||infix[i]==(char)operators.peek())
						{
							operators.push(infix[i]);
						}
						else{
							while(infix[i]<(char)operators.peek())
							{
								postfix=postfix+(char)operators.pop()+'.';
							}
							operators.push(infix[i]);
						}
					}
				}
			}
			else{
				postfix=postfix+infix[i];
			}
		}
		postfix=postfix+"."
		while(!operators.empty())
		{
				postfix=postfix+(char)operators.pop()+'.';
		}
		System.out.println(postfix);
		
		
	}
	
}
