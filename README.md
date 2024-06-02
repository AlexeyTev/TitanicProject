# Titanic Passenger Data Analysis

## Overview

This project is a Java application that allows you to analyze passenger data from the infamous Titanic shipwreck in 1912. The application reads passenger information from a CSV file and provides various filtering and statistical analysis capabilities.

## Features

- **Read passenger data from a CSV file**
- **Filter passengers based on various criteria:**
  - Passenger ID range
  - Passenger name (substring matching)
  - Passenger gender
  - Number of siblings/spouses aboard
  - Number of parents/children aboard
  - Ticket number
  - Fare cost range
  - Cabin number
  - Embarkation port
- **Display the number of filtered passengers, survivors, and non-survivors**
- **Generate a new CSV file containing the filtered passenger records, sorted by first name**
- **Create a statistics file (Statistics.txt) with survival rate analysis based on:**
  - Passenger class
  - Gender
  - Age group
  - Family members aboard
  - Fare cost
  - Embarkation port

## Technologies Used

- Java
- Maven
- Swing (for building the graphical user interface)
