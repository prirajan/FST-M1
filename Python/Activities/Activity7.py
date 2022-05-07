# sum of elements in the list
input_string = input('Enter elements of a list separated by space ')
print("\n")
user_list = input_string.split()
# print list
print(user_list)
# convert each item to int type
for i in range(len(user_list)):
    # convert each item to int type
    user_list[i] = int(user_list[i])

# Calculating the sum of list elements
print("Sum = ", sum(user_list))