import string


def clean_text(given_string:str) -> str:
    content = ""
    for letter in [letter for letter in given_string.lower() if not letter.isdigit() and letter not in string.punctuation]:
        content += letter
    content_encoded = content.encode('ascii', 'ignore')
    return content_encoded.decode('ascii','ignore')

dictionary = {}


def count_words_freq(cleaned_text:str, dictionary:dict) -> dict:
    for word in cleaned_text.split():
        dictionary[word] = dictionary.get(word,0) + 1
    return dictionary

excerpt = """
“It was much pleasanter at home,” thought poor Alice, “when one wasn’t
always growing larger and smaller, and being ordered about by mice and
rabbits. I almost wish I hadn’t gone down that rabbit-hole—and yet—and
yet—it’s rather curious, you know, this sort of life! I do wonder what
_can_ have happened to me! When I used to read fairy-tales, I fancied
that kind of thing never happened, and now here I am in the middle of
one! There ought to be a book written about me, that there ought! And
when I grow up, I’ll write one—but I’m grown up now,” she added in a
sorrowful tone; “at least there’s no room to grow up any more _here_.”

“But then,” thought Alice, “shall I _never_ get any older than I am
now? That’ll be a comfort, one way—never to be an old woman—but
then—always to have lessons to learn! Oh, I shouldn’t like _that!_”

“Oh, you foolish Alice!” she answered herself. “How can you learn
lessons in here? Why, there’s hardly room for _you_, and no room at all
for any lesson-books!”

And so she went on, taking first one side and then the other, and
making quite a conversation of it altogether; but after a few minutes
she heard a voice outside, and stopped to listen.

“Mary Ann! Mary Ann!” said the voice. “Fetch me my gloves this moment!”
Then came a little pattering of feet on the stairs. Alice knew it was
the Rabbit coming to look for her, and she trembled till she shook the
house, quite forgetting that she was now about a thousand times as
large as the Rabbit, and had no reason to be afraid of it.

Presently the Rabbit came up to the door, and tried to open it; but, as
the door opened inwards, and Alice’s elbow was pressed hard against it,
that attempt proved a failure. Alice heard it say to itself “Then I’ll
go round and get in at the window.”

“_That_ you won’t!” thought Alice, and, after waiting till she fancied
she heard the Rabbit just under the window, she suddenly spread out her
hand, and made a snatch in the air. She did not get hold of anything,
but she heard a little shriek and a fall, and a crash of broken glass,
from which she concluded that it was just possible it had fallen into a
cucumber-frame, or something of the sort.

Next came an angry voice—the Rabbit’s—“Pat! Pat! Where are you?” And
then a voice she had never heard before, “Sure then I’m here! Digging
for apples, yer honour!”

“Digging for apples, indeed!” said the Rabbit angrily. “Here! Come and
help me out of _this!_” (Sounds of more broken glass.)

“Now tell me, Pat, what’s that in the window?”

“Sure, it’s an arm, yer honour!” (He pronounced it “arrum.”)

“An arm, you goose! Who ever saw one that size? Why, it fills the whole
window!”

“Sure, it does, yer honour: but it’s an arm for all that.”

“Well, it’s got no business there, at any rate: go and take it away!”

There was a long silence after this, and Alice could only hear whispers
now and then; such as, “Sure, I don’t like it, yer honour, at all, at
all!” “Do as I tell you, you coward!” and at last she spread out her
hand again, and made another snatch in the air. This time there were
_two_ little shrieks, and more sounds of broken glass. “What a number
of cucumber-frames there must be!” thought Alice. “I wonder what
they’ll do next! As for pulling me out of the window, I only wish they
_could!_ I’m sure _I_ don’t want to stay in here any longer!”

"""
print(count_words_freq(clean_text(excerpt),dictionary))