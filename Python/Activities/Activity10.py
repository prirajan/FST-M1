
input_string = input('Enter elements of a list1 separated by space ')
#print(input_string)
tuple1 = tuple(input_string.split())
print(tuple1)

for number in tuple1:
    if (int(number) % 5 ==0): # numbers which are divisible by 5
        print(number)
        

