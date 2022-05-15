
from csv import writer
import pandas as pd
from pandas import ExcelFile
from pandas import ExcelWriter

person = {
    "FirstName":["Satvik","Avinash","Lahri"],
    "LastName":["Shah","Kati","Rath"],
    "Email":["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber":["4537829158","5892184058","4528727830"]

}

dataframe = pd.DataFrame(person)
writer = ExcelWriter("persons.xlsx")#	# Create an ExcelWriter object
dataframe.to_excel(writer,sheet_name="Sheet1",index= False)
writer.save()

dataframe1=pd.read_excel("persons.xlsx",sheet_name="Sheet1")
print(dataframe1)







