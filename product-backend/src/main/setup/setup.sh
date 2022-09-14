# ~~~ Database Setup Script Instructions ~~~

# To make this script executable,
# navigate to the directory containing this file in the terminal, and run the following command:

# chmod a+x setup.sh

# Once this has been run,
# run the following command in the same directory to create the database:

# ./setup.sh

# Make sure to input your own password --password=<here>
mysql --user=root --password=mariadb.password < initialise.sql

