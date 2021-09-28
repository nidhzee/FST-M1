from datetime import date
name = input("Enter your name:")
age= input("Enter your age:")

todays_date = date.today()
current_year=todays_date.year

age_diff= 100-int(age)
print("you will be 100 years old in the year", current_year+age_diff )
