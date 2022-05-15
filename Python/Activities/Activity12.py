
def sumNumbers(num):
    if num:
        return num + sumNumbers(num-1) 
    else:
        return 0


print("The sum is: ", sumNumbers(10))
