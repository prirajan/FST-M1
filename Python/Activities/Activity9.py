
input_string1 = input('Enter elements of a list1 separated by space ')
#combining list
input_string2 = input('Enter elements of a list2 separated by space ')
#print("\n")
List1=input_string1.split()
print(List1)
List2=input_string2.split()
print(List2)
list3=[]
for number in List1:
    if (int(number) % 2 !=0): # to add odd numbers is list 
        list3.append(number)
for number in List2:
    if (int(number) % 2 ==0):
        list3.append(number) # to add evennumbers is list 
print(f"list 3 is: {list3}")





