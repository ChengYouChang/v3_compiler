//#define AG_ALREADY_CREATED      1
//#define AG_NOT_FOUND            2
//#define EXIT_OK 1

int *tim1_cr1 = (int *)0x4200, *tim1_sr = (int *)0x4208,  *prc_addr = (int *)0x420C, *arr_addr = (int *)0x4210;
int prc = 49, arr = 999;
int *gpio_dir = (int *)0x4000, *gpio_val = (int *)0x4004;
int led0 = 1, led1 = 2,  led2 = 4, led3 = 8;

//typedef struct Agenda_v2Type Agenda_v2;
//struct Agenda_v2Type
//{
//	int *SP;
//	void (*function) (void);
//	Agenda_v2 *next;
//};
struct Agenda_v2{
	int *SP;
	void (*function) (void);
	struct Agenda_v2 *next;
};
//Agenda_v2 *agenda_list = 0, *OS_current = 0;
struct Agenda_v2 *agenda_list = 0, *OS_current = 0;
//unsigned  int current_flag = 0;
int current_flag = 0;
//Agenda_v2 agenda_func_buf[3]={0};
struct Agenda_v2 agenda_func_buf[3]={0};

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