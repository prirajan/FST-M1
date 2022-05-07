
FruitsDict={
    "banana": 20,
    "orange": 30,
    "cherry": 60,
    "watermelon": 100

}
print(FruitsDict)
input_string = input('Enter the fruit name to find in Dict: ').lower()
if (input_string in FruitsDict):
    print(f"{input_string} is available" )

else:
    print(f"{input_string} is not available" )

