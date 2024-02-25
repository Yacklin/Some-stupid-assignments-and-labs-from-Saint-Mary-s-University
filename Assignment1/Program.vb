Imports System
'Author: Yilin Huang
Module Program
    Sub Main(args As String())
        'declaration of Question1
        Console.WriteLine("This is the first question")
        'declare firstname
        Dim firstName As String
        'declare lastname
        Dim lastName As String
        'declare full name
        Dim fullName As String
        'print hint to user
        Console.WriteLine("Please enter your first name")
        'read string from user
        firstName = Console.ReadLine()
        'prompt user to enter last name
        Console.WriteLine("Please enter your last name")
        'read
        lastName = Console.ReadLine()
        'concatenate two strings
        fullName = firstName + " " + lastName
        'first way to print
        Console.WriteLine("hello, {0} have a nice day", fullName)
        'second way
        Console.WriteLine($"hello {fullName} " + "have a nice day")
        'third way
        Console.WriteLine("hello " & fullName & "kkk")
        'last required empty line
        Console.WriteLine()
        'declaration of Question2
        Console.WriteLine("This is the second question")
        'declare marks
        Dim marks As Integer
        'declare grades
        Dim grades As String
        'prompt user to enter
        Console.WriteLine("please enter your marks")
        'read integer from user
        marks = Console.ReadLine()
        'A+ range
        If ((marks <= 100) And (marks >= 90)) Then
            'assigenment of variable
            grades = "A+"
            'A range
        ElseIf ((marks <= 89) And (marks >= 85)) Then
            'assignment of grades
            grades = "A"
            'A- range
        ElseIf ((marks <= 84) And (marks >= 80)) Then
            'assignment of grades
            grades = "A-"
            'B+ range
        ElseIf ((marks <= 79) And (marks >= 77)) Then
            'assignment of grades
            grades = "B+"
            'B range
        ElseIf ((marks <= 76) And (marks >= 73)) Then
            'grades assignment
            grades = "B"
            'B- range
        ElseIf ((marks <= 72) And (marks >= 70)) Then
            'grades assignment
            grades = "B-"
            'F range
        ElseIf (marks < 70) Then
            'assignment of grades
            grades = "F"
            'processing invalid input
        Else
            'undefined
            grades = "undefined"
            'if ends
        End If
        'print info
        Console.WriteLine("the student's grade is {0}", grades)
        'required empty line
        Console.WriteLine()
        'third question
        Console.WriteLine("This is the third question")
        'declaration and text storage
        Dim myinformation As String = " Computer science Is the study Of computation, information, And
                                        automation.Algorithms And Data types are central to computer science "
        'calculation of length
        Dim lengthString As Integer = myinformation.Length
        'print the length
        Console.WriteLine(lengthString)
        'trim the String
        myinformation = myinformation.Trim()
        'print myinfo
        Console.WriteLine(myinformation)
        'replacement of words
        myinformation = myinformation.Replace("data types", "data structures")
        'print the string after replacement
        Console.WriteLine(myinformation)
        'declare string
        Dim subString As String
        'get the word "computer science"
        subString = myinformation.Substring(0, 16)
        'print the substring
        Console.WriteLine(subString)
        'declaration and assignment of upperstring
        Dim upperString As String = myinformation.ToUpper()
        'declaration and assignment of lowerstring
        Dim lowerString As String = myinformation.ToLower()
        'print upper
        Console.WriteLine(upperString)
        'print lower
        Console.WriteLine(lowerString)
        'split string into words
        Dim myWords As String() = myinformation.Split(" ")
        'print it with for each
        Console.WriteLine("this is the first printing method")
        'use of for loop
        For Each word As String In myWords
            'print every word
            Console.WriteLine(word)
        Next
        'required empty line
        Console.WriteLine()
        'declaration of next question
        Console.WriteLine("this is the second printing method")
        'another way to print it
        For i As Integer = 0 To myWords.Length - 1
            'print every word
            Console.WriteLine(i)
        Next
        'required empty line
        Console.WriteLine()
        'declaration of next question
        Console.WriteLine("this is the fourth Question")
        'five lines
        For h As Integer = 0 To 4
            'one line contains five *
            For t As Integer = 0 To 4
                'print *
                Console.Write("*"c)
            Next
            'next line
            Console.WriteLine()
        Next
        'required empty line
        Console.WriteLine()
        'declaration of next question
        Console.WriteLine("this is the fifth Question")
        'declaration of multidimensional array
        Dim jobInformation(2, 2) As Integer
        'assignment for each element
        jobInformation(0, 0) = 1500
        'assignment for each element
        jobInformation(0, 1) = 2500
        'assignment for each element
        jobInformation(0, 2) = 1000
        'assignment for each element
        jobInformation(1, 0) = 2000
        'assignment for each element
        jobInformation(1, 1) = 2200
        'assignment for each element
        jobInformation(1, 2) = 200
        'assignment for each element
        jobInformation(2, 0) = 3000
        'assignment for each element
        jobInformation(2, 1) = 1000
        'assignment for each element
        jobInformation(2, 2) = -2000
        For j As Integer = 0 To jobInformation.GetLength(0) - 1
            For k As Integer = 0 To jobInformation.GetLength(1) - 1
                'print every word in every element
                Console.Write(jobInformation(j, k))
            Next
            'next line
            Console.WriteLine()
        Next
        'required empty line
        Console.WriteLine()
    End Sub
End Module
