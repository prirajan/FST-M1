#Find the given number is even or odd

num = int(input("Enter a number to find odd or even"))
mod = num % 2
if mod > 0:
    print(f"the number {num} you picked is odd number")
else:
    print(f"the number{num} you picked is even number")

