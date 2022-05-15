
import pandas as pd

Dataframe = pd.read_excel("persons.xlsx",sheet_name="Sheet1")
#print(Dataframe)
print(Dataframe.shape)
print(Dataframe['Email'])
print(Dataframe.sort_values('FirstName'))



