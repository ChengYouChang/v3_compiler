#define AG_ALREADY_CREATED      1
#define AG_NOT_FOUND            2
#define EXIT_OK 1

int *tim1_cr1 = (int *)0x4200, *tim1_sr = (int *)0x4208,  *prc_addr = (int *)0x420C, *arr_addr = (int *)0x4210;
int prc = 49, arr = 999;
int *gpio_dir = (int *)0x4000, *gpio_val = (int *)0x4004;
int led0 = 1, led1 = 2,  led2 = 4, led3 = 8;

typedef struct Agenda_v2Type Agenda_v2;
struct Agenda_v2Type
{
	int *SP;
	void (*function) (void);
	Agenda_v2 *next;
};
Agenda_v2 *agenda_list = 0, *OS_current = 0;
unsigned  int current_flag = 0;
Agenda_v2 agenda_func_buf[3]={0};

int add_task(void (*func)(void), int *init_sp);
void func1(void);
void func2(void);
void func3(void);
void Timer1(void);
void os_start(void);

int main()
{
	add_task(func1, (int*)15000);
	add_task(func2, (int*)14000);
	add_task(func3, (int*)13000);
	Timer1();
	os_start();
	while(1)
	{
		
	}
	return 0;
}
int add_task(void (*func)(void), int *init_sp)
{
	int i;
	Agenda_v2 *current = agenda_list;
	for(i=0; i<current_flag; i++)
	{
		if(current->function == func)
			return AG_ALREADY_CREATED;
		else
			current = current->next;
	}

	if(!(current = &agenda_func_buf[current_flag]))
		return -1;
	
	init_sp -= 1;
	*(init_sp) = (int)func; //LR
	init_sp -= 1;
	*(init_sp) = 0;	//SW
	
	init_sp -= 1;
	*(init_sp) = 0; //R11
	init_sp -= 1;
	*(init_sp) = 0; //R10
	init_sp -= 1;
	*(init_sp) = 0;	//R9
	init_sp -= 1;
	*(init_sp) = 0;	//R8
	init_sp -= 1;
	*(init_sp) = 0;	//R7
	init_sp -= 1;
	*(init_sp) = 0; //R6
	init_sp -= 1;
	*(init_sp) = 0;	//R5
	init_sp -= 1;
	*(init_sp) = 0;	//R4
	init_sp -= 1;
	*(init_sp) = 0;	//R3
	init_sp -= 1;
	*(init_sp) = 0; //R2
	init_sp -= 1;
	*(init_sp) = 0; //R1

	current->SP = init_sp;
	current->function = func;
	current->next = agenda_list;
	current_flag++;
	agenda_list = current;
	agenda_func_buf[0].next = agenda_list;
	OS_current = agenda_list;
	return EXIT_OK;
}
void os_start(void)
{
	
}

void func1(void){
	while(1)
	{
		int i, j;
		for (i = 0; i < 30; i++) 
			{
				for (j = 0; j < 32767; j++) 
				{
				}	
		}
		*gpio_val = *gpio_val ^ led0;
	}
}
void func2(void){
	while(1)
	{
		int i, j;
		for (i = 0; i < 30; i++) 
			{
				for (j = 0; j < 32767; j++) 
				{
				}	
		}
		*gpio_val = *gpio_val ^ led1;
	}
}
void func3(void){
	while(1)
	{
		int i, j;
		for (i = 0; i < 30; i++) 
		{
			for (j = 0; j < 32767; j++) 
			{
				
			}
		}
		*gpio_val = *gpio_val ^ led2;
	}
}
void Timer1(void)
{
	*prc_addr = prc;
	*arr_addr = arr;
	*tim1_cr1 = 1;
}

void ISR_TIM1(void)
{
	//push_all();
	//set_struct_sp(OS_current->SP);
	OS_current = OS_current->next;
	*gpio_val = *gpio_val ^ led3;
	//set_SP(OS_current->SP);
	//pop_all();
	*tim1_sr = 0;
}

