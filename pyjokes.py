#!/usr/bin/env python3
import requests

headers = {
    "Accept" : "text/plain"
}
response = requests.get('https://icanhazdadjoke.com',headers=headers)
print(response.text)