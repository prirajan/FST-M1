#printing Multiplication table for a given number
number = int(input("input the number for which multiplication table to be printed"))
count=1
print("The multiplication table is for", number)
while count <11:
    number = number*1
    print(number,'x',count, '=', number*count)
    count += 1
