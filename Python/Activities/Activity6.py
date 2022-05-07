from turtle import end_fill


#printing pattern
number = int(input("input the number for which pattern to be printed"))
for i in range(number):
    for j in range(i):
        print(i,end ='')
    print('')
 