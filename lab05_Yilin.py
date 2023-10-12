def is_palindrome_based_on_algorithm1(string_given: str) -> bool:
    '''
    return true or false
    :param string_given:
    :return:
    '''
    return string_given == string_given[::-1]


def is_palindrome_based_on_algorithm2(string_given: str) -> bool:
    '''
    return true or false
    :param string_given:
    :return:
    '''
    if len(string_given) % 2 == 0:
        temp = string_given[(len(string_given) // 2):]
        return string_given[:(len(string_given)//2)] == temp[::-1]
    else:
        temp = string_given[((len(string_given) + 1) // 2):]
        return string_given[:((len(string_given) - 1)//2)] == temp[::-1]

flag = True
def  is_palindrome_based_on_algorithm3(string_given: str) -> bool:
    global flag
    '''
    return true or false
    :param string_given:
    :return:
    '''
    if len(string_given) % 2 == 0:
        for i in range((len(string_given)//2)):
            if string_given[i] != string_given[-1 - i]:
                flag = False
            else:
                pass
        return flag
    elif len(string_given) %2 == 1:
        for i in range(((len(string_given)-1)//2)):
            if string_given[i] != string_given[-1 - i]:
                flag = False
            else:
                pass
        return flag


a = input("please enter the string you wanna test")
print(is_palindrome_based_on_algorithm1(a))
print(is_palindrome_based_on_algorithm2(a))
print(is_palindrome_based_on_algorithm3(a))

assert is_palindrome_based_on_algorithm1(a)
assert is_palindrome_based_on_algorithm2(a)
assert is_palindrome_based_on_algorithm3(a)