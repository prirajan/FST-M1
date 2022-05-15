
import pandas as pd
credential = {
    "Username": ["admin","charles","Deku"],
    "Passwords": ["password","charll3","AllMight"]
    

}


dataframe = pd.DataFrame(credential)
dataframe.to_csv('login.csv')


