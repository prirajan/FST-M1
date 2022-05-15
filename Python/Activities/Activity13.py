
def sumNumbersfromList(numbers):
    sum=0
    for num in numbers:
        sum +=num
    return sum
        
 

input_string = input('Enter numbers  of a list separated by space ')
numbers_list = input_string.split()
for i in range(len(numbers_list)):
    # convert each item to int type
    numbers_list[i] = int(numbers_list[i])

result = sumNumbersfromList(numbers_list)
print(result)
