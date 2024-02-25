Imports System

Module Program
    Sub Main(args As String())
        'declaration of project 1
        Console.WriteLine("=======project 1=======")
        'description of project 1
        Console.WriteLine("generate the password and protect the privacy of the password")
        'start the project
        Console.WriteLine("password generator:")
        'prompt the user to enter the key
        Console.WriteLine("please enter the number of chars in password. the number you entered should be a positive Integer and greater than 5")
        'define variable of integer to store the user input
        Dim lengthOfPassword As Integer
        'start the while loop
        While True
            'read value from user
            lengthOfPassword = Console.ReadLine()
            'when to reject invalid value
            If lengthOfPassword <= 5 Then
                'prompt the user to enter another one
                Console.WriteLine("your input is invalid and please try again")
                'go to the next round of while loop
                Continue While
                'when to accept value
            Else
                'confirmation of length of password
                Console.WriteLine($"your input is valid. the number of chars in your password is {lengthOfPassword}")
                'break the while loop
                Exit While
                'end if selection
            End If
            'end while loop
        End While
        'define a string variable to contain allowed characters in password
        Dim charLib As String = ¡°abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-=_+¡±
        'define a container to store randomly generated password
        Dim mypassword As String = ""
        'define a random obj
        Dim randomObj As New Random()
        'use the for loop to structure password
        For i As Integer = 0 To lengthOfPassword - 1
            'add char one by one
            mypassword &= charLib.Chars(randomObj.Next(0, charLib.Length))
        Next
        'define char array to be reversed
        Dim password = mypassword.Substring(0).ToCharArray()
        'reverse the array
        Array.Reverse(Of Char)(password)
        'convert char array to string
        Dim str As New String(password)
        'display the password
        Console.WriteLine($"your password is {mypassword}")
        Console.WriteLine()
        'declaration of starting reverse algorithm
        Console.WriteLine("=========Start reverse encryption algorithm========")
        'display the reversed one
        Console.WriteLine($"reversed password is :{str}")
        Console.WriteLine()
        'declaration of starting encryption algorithm
        Console.WriteLine("========start caesar cipher algorithm========")
        Console.WriteLine("========entering the key of caesar cipher algorithm========")
        'prompt the user to enter the key
        Console.WriteLine("please enter the key of caesar cipher algorithm: (an integer between 10 and 1000)")
        'define integer variable to store the key from user
        Dim key As Integer
        'start the while loop of validation
        While True
            'reading value from user
            key = Console.ReadLine()
            'starting if selection
            If (key < 10) Or (key > 1000) Then
                'reminder to prompt user to try again
                Console.WriteLine("your input is invalid. please try again")
                'go to next round of while loop
                Continue While
                'when to accept valid value
            Else
                'confirmation of allowed input
                Console.WriteLine($"your input is valid. the key you input is {key}")
                'break the while loop
                Exit While
                'at the end of if selection
            End If
            'end the while loop
        End While
        Console.WriteLine()
        'start encryption
        Console.WriteLine("========start caesar cipher encryption========")
        'define variable to store the encrypted
        Dim encrypted As String = ""
        'define variable to store the decrypted
        Dim decrypted As String = ""
        'created to store CharLib index of every char of the decrypted
        Dim x As Integer
        'declared to store CharLib index of every char of the encrypted
        Dim y As Integer
        'encrypting by the use of for loop
        For j As Integer = 0 To lengthOfPassword - 1
            y = charLib.IndexOf(mypassword(j)) + key - charLib.Length * Int((charLib.IndexOf(mypassword(j)) + key) / charLib.Length)
            'add char one by one
            encrypted &= charLib(y)
        Next
        'display password and password encrypted
        Console.WriteLine($"the caesar-cipher-generated one for {mypassword} is {encrypted}")
        Console.WriteLine()
        'starting decryption
        Console.WriteLine("========start decryption========")
        'use for loop to decrypt the encrypted
        For l As Integer = 0 To lengthOfPassword - 1
            x = charLib.IndexOf(encrypted(l)) - key - charLib.Length * Int((charLib.IndexOf(encrypted(l)) - key) / charLib.Length)
            decrypted &= charLib(x)
        Next
        'display the decrypted, which should be the same as plaintext
        Console.WriteLine($"decrypted one is: {decrypted}")
    End Sub
End Module
