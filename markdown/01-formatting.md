# Markdown Formatting

## GitHub-Flavored Markdown

Unfortunately, there isn't a uniform set of rules governing formatting for markdown, so different versions of these rules, or "flavors", exist. However, this lesson will focus on GitHub-flavored markdown, which is used by GitHub to render README and other markdown files in HTML. Without further ado...

## Creating Your Own Markdown

### Rendering
If you have already taken the Git course, then you can commit and push your practice Markdown files to GitHub to render the markdown as HTML. However, this is not required; you can use a live markdown preview website ([like this!](http://markdownlivepreview.com/)) to render the markdown.

### Formatting
Below is a table with the markdown equivalents of common HTML elements:

| Element type      | HTML element        | Markdown equivalent        | Example               |
|-------------------|---------------------|----------------------------|-----------------------|
| Header            | `<h1></h1>`         | `#` or `=====` underneath  | [H1](#h1)             |
| Header            | `<h2></h2>`         | `##` or `-----` underneath | [H2](#h2)             |
| Header            | `<h3></h3>`         | `###`                      | [H3](#h3)             |
| Header            | `<h4></h4>`         | `####`                     | [H4](#h4)             |
| Header            | `<h5></h5>`         | `#####`                    | [H5](#h5)             |
| Header            | `<h6></h6>`         | `######`                   | [H6](#h6)             |
| Emphasis          | `<strong></strong>` | `__text__` or `**text**`   | [Emphasis](#emphasis) |
| Emphasis          | `<em></em>`         | `_text_` or `*text*`       | [Emphasis](#emphasis) |
| Emphasis          | `<em></em>`         | `~~text~~`                 | [Emphasis](#emphasis) |
| Unordered List    | `<li></li>`         | `-` or `*` or `+`          | [Lists](#lists)       |
| Ordered List      | `<li></li>`         | `1.`, `2.`, etc.           | [Lists](#lists)       |
| Inline code block | n/a                 | `\`code\``                 | [Code](#code)         |
| Code block        | n/a                 | ``````                     | [Code](#code)         |

Keep exploring [here](https://github.com/adam-p/markdown-here/wiki/Markdown-Here-Cheatsheet)! When you're ready, move on to the practice lesson.

## Reference

## Headers

# H1
## H2
### H3
#### H4
##### H5
###### H6

## Emphasis
Emphasis, aka italics, with *asterisks* or _underscores_.

Strong emphasis, aka bold, with **asterisks** or __underscores__.

Combined emphasis with **asterisks and _underscores_**.

Strikethrough uses two tildes. ~~Scratch this.~~

## Lists

- First ordered list item
- Another item
  - Unordered sub-list.

1. Actual numbers don't matter, just that it's a number
  1. Ordered sub-list
4. And another item

## Code

Inline `code` has `back-ticks around` it.

```javascript
var s = "JavaScript syntax highlighting";
alert(s);
```
