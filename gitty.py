"""
adds all the updated files
comits and pushes them all
"""
from os import system

commands = [
	'git status',
	'git add --all',
	'git commit -m ',
	'git push origin master'
]


def get_status():
	"""
	prints the status
	of the git repo
	"""
	system(commands[0])
	print("\n")


def main():
	"""
	main function
	"""
	print("Status : \n\n")
	get_status()
	
	system(commands[1]) # add all files
	get_status() # print updated status

	commit_message = input("Enter commit message : ")
	command = str(commands[2]) + "'" + str(commit_message) + "'"
	print(command)
	system(command) # commits

	system(commands[3]) # push to master 

	exit()

if __name__ == '__main__':
	main()

