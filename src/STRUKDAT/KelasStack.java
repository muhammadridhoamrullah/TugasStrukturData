class KelasStack
//@author Muhammad Ridho Amrullah
{
	int st_elements[]=new int[10];
	int tos;
	KelasStack()
	{
		tos = -1;        
	}

public void push(int item)  //Untuk Mem-Push(Memasukkan) Angka 
	{
	if(tos==10)                      
		{
		System.out.println("STACK PENUH!!");
		return;
		}
		else
		{
		 st_elements[++tos] = item;
		}
	}
	public int pop()	//Untuk Mem-Pop(Mengeluarkan) Angka 
	{
		if(tos<0)
		{
			System.out.println("STACK KOSONG");
			return 0;
		}
		else
			return st_elements[tos--];
	}
	public boolean empty_stack() //Ngecek Kalo Kosong atau Tidak
	{
		if (tos == -1)
			return true;
		else return false;
	}
	public void print() //NgePrint Stack
	{
		int temp=0;
		
		if(!empty_stack())
		{
			temp = pop();
			System.out.println(temp);
			print();
		}
		push(temp);
	}


};