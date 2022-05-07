#if first & last element are same in the list
input_string = input('Enter elements of a list separated by space ')
#print("\n")
ListofNumbers=input_string.split()
print(ListofNumbers)
firstNumber = ListofNumbers[0]
lastNumber = ListofNumbers[-1]

if (firstNumber == lastNumber):
    print(True)
else:
    print(False)




