USE puppies_passion;

-- Add categories
INSERT INTO categories(id, name, url) VALUES (1, 'Bags','/images/categories/bags/dog-bags.jpg');
INSERT INTO categories(id, name, url) VALUES (2, 'Beds', '/images/categories/beds/dog-beds.jpg');
INSERT INTO categories(id, name, url) VALUES (3, 'Bowls', '/images/categories/bowls/dog-bowls.jpg');
INSERT INTO categories(id, name, url) VALUES (4, 'Clothes', '/images/categories/clothes/dog-clothes.jpg');
INSERT INTO categories(id, name, url) VALUES (5, 'Combs', '/images/categories/combs/dog-combs.jpg');
INSERT INTO categories(id, name, url) VALUES (6, 'Jewelry', '/images/categories/jewelry/dog-jewelry.jpg');
INSERT INTO categories(id, name, url) VALUES (7, 'Leashes', '/images/categories/leashes/dog-leashes.jpg');
INSERT INTO categories(id, name, url) VALUES (8, 'Toys', '/images/categories/toys/dog-toys.jpg');



-- Add user roles
INSERT INTO user_roles(id, user_role) VALUES (1, 'ADMIN');
INSERT INTO user_roles(id, user_role) VALUES (2, 'MODERATOR');
INSERT INTO user_roles(id, user_role) VALUES (3, 'CLIENT');



-- Add pictures for model-bag-1
INSERT INTO pictures (id, url) VALUES (1, '/images/categories/bags/model-bag-1/model-bag-1_1.jpg');
INSERT INTO pictures (id, url) VALUES (2, '/images/categories/bags/model-bag-1/model-bag-1_2.jpg');
INSERT INTO pictures (id, url) VALUES (3, '/images/categories/bags/model-bag-1/model-bag-1_3.jpg');
INSERT INTO pictures (id, url) VALUES (4, '/images/categories/bags/model-bag-1/model-bag-1_4.jpg');
INSERT INTO pictures (id, url) VALUES (5, '/images/categories/bags/model-bag-1/model-bag-1_5.jpg');
INSERT INTO pictures (id, url) VALUES (6, '/images/categories/bags/model-bag-1/model-bag-1_6.jpg');
INSERT INTO pictures (id, url) VALUES (7, '/images/categories/bags/model-bag-1/model-bag-1_7.jpg');
-- Add model-bag-1
INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (1, 'Dog bag', 'DESCRIPTION', 1, 9.99, 1000, 0);
-- Add model-bag-1 to bags
INSERT INTO categories_products (category_id, products_id) VALUES (1, 1);
-- Connect pictures for model-bag-1
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 1);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 2);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 3);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 4);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 5);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 6);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 7);



-- Add pictures for model-bag-2
INSERT INTO pictures (id, url) VALUES (8, '/images/categories/bags/model-bag-2/model-bag-2_1.jpg');
INSERT INTO pictures (id, url) VALUES (9, '/images/categories/bags/model-bag-2/model-bag-2_2.jpg');
INSERT INTO pictures (id, url) VALUES (10, '/images/categories/bags/model-bag-2/model-bag-2_3.jpg');
INSERT INTO pictures (id, url) VALUES (11, '/images/categories/bags/model-bag-2/model-bag-2_4.jpg');
INSERT INTO pictures (id, url) VALUES (12, '/images/categories/bags/model-bag-2/model-bag-2_5.jpg');
-- Add model-bag-2
INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (2, 'Dog backpack', 'DESCRIPTION', 1, 19.99, 2000, 0);
-- Add model-bag-2 to bags
INSERT INTO categories_products (category_id, products_id) VALUES (1, 2);
-- Connect pictures for model-bag-2
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 8);
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 9);
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 10);
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 11);
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 12);



-- Add pictures for model-bag-3
INSERT INTO pictures (id, url) VALUES (13, '/images/categories/bags/model-bag-3/model-bag-3_1.jpg');
INSERT INTO pictures (id, url) VALUES (14, '/images/categories/bags/model-bag-3/model-bag-3_2.jpg');
INSERT INTO pictures (id, url) VALUES (15, '/images/categories/bags/model-bag-3/model-bag-3_3.jpg');
INSERT INTO pictures (id, url) VALUES (16, '/images/categories/bags/model-bag-3/model-bag-3_4.jpg');
INSERT INTO pictures (id, url) VALUES (17, '/images/categories/bags/model-bag-3/model-bag-3_5.jpg');
-- Add model-bag-3
INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (3, 'Dog car bag', 'DESCRIPTION', 1, 29.99, 3000, 100);
-- Add model-bag-3 to bags
INSERT INTO categories_products (category_id, products_id) VALUES (1, 3);
-- Connect pictures for model-bag-3
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 13);
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 14);
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 15);
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 16);
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 17);



-- Add pictures for model-bed-1
INSERT INTO pictures (id, url) VALUES (18, '/images/categories/beds/model-bed-1/model-bed-1_1.jpg');
INSERT INTO pictures (id, url) VALUES (19, '/images/categories/beds/model-bed-1/model-bed-1_2.jpg');
INSERT INTO pictures (id, url) VALUES (20, '/images/categories/beds/model-bed-1/model-bed-1_3.jpg');
INSERT INTO pictures (id, url) VALUES (21, '/images/categories/beds/model-bed-1/model-bed-1_4.jpg');
INSERT INTO pictures (id, url) VALUES (22, '/images/categories/beds/model-bed-1/model-bed-1_5.jpg');
-- Add model-bed-1
INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (4, 'Dog bed', 'DESCRIPTION', 2, 19.99, 1000, 0);
-- Add model-bed-1 to beds
INSERT INTO categories_products (category_id, products_id) VALUES (2, 4);
-- Connect pictures for model-bed-1
INSERT INTO products_pictures (product_id, picture_id) VALUES (4, 18);
INSERT INTO products_pictures (product_id, picture_id) VALUES (4, 19);
INSERT INTO products_pictures (product_id, picture_id) VALUES (4, 20);
INSERT INTO products_pictures (product_id, picture_id) VALUES (4, 21);
INSERT INTO products_pictures (product_id, picture_id) VALUES (4, 22);



-- Add pictures for model-bed-2
INSERT INTO pictures (id, url) VALUES (23, '/images/categories/beds/model-bed-2/model-bed-2_1.jpg');
INSERT INTO pictures (id, url) VALUES (24, '/images/categories/beds/model-bed-2/model-bed-2_2.jpg');
INSERT INTO pictures (id, url) VALUES (25, '/images/categories/beds/model-bed-2/model-bed-2_3.jpg');
INSERT INTO pictures (id, url) VALUES (26, '/images/categories/beds/model-bed-2/model-bed-2_4.jpg');
-- Add model-bed-2
INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (5, 'Large dog bed', 'DESCRIPTION', 2, 29.99, 2000, 0);
-- Add model-bed-2 to beds
INSERT INTO categories_products (category_id, products_id) VALUES (2, 5);
-- Connect pictures for model-bed-2
INSERT INTO products_pictures (product_id, picture_id) VALUES (5, 23);
INSERT INTO products_pictures (product_id, picture_id) VALUES (5, 24);
INSERT INTO products_pictures (product_id, picture_id) VALUES (5, 25);
INSERT INTO products_pictures (product_id, picture_id) VALUES (5, 26);



-- Add pictures for model-bed-3
INSERT INTO pictures (id, url) VALUES (27, '/images/categories/beds/model-bed-3/model-bed-3_1.jpg');
INSERT INTO pictures (id, url) VALUES (28, '/images/categories/beds/model-bed-3/model-bed-3_2.jpg');
INSERT INTO pictures (id, url) VALUES (29, '/images/categories/beds/model-bed-3/model-bed-3_3.jpg');
INSERT INTO pictures (id, url) VALUES (30, '/images/categories/beds/model-bed-3/model-bed-3_4.jpg');
-- Add model-bed-3
INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (6, 'Puppy bed', 'DESCRIPTION', 2, 39.99, 3000, 0);
-- Add model-bed-3 to beds
INSERT INTO categories_products (category_id, products_id) VALUES (2, 6);
-- Connect pictures for model-bed-3
INSERT INTO products_pictures (product_id, picture_id) VALUES (6, 27);
INSERT INTO products_pictures (product_id, picture_id) VALUES (6, 28);
INSERT INTO products_pictures (product_id, picture_id) VALUES (6, 29);
INSERT INTO products_pictures (product_id, picture_id) VALUES (6, 30);



-- Add pictures for model-bowl-1
INSERT INTO pictures (id, url) VALUES (31, '/images/categories/bowls/model-bowl-1/model-bowl-1_1.jpg');
INSERT INTO pictures (id, url) VALUES (32, '/images/categories/bowls/model-bowl-1/model-bowl-1_2.jpg');
INSERT INTO pictures (id, url) VALUES (33, '/images/categories/bowls/model-bowl-1/model-bowl-1_3.jpg');
INSERT INTO pictures (id, url) VALUES (34, '/images/categories/bowls/model-bowl-1/model-bowl-1_4.jpg');
INSERT INTO pictures (id, url) VALUES (35, '/images/categories/bowls/model-bowl-1/model-bowl-1_5.jpg');
-- Add model-bowl-1
INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (7, 'Slow Bowl', 'DESCRIPTION', 3, 29.99, 1000, 0);
-- Add model-bowl-1 to bowls
INSERT INTO categories_products (category_id, products_id) VALUES (3, 7);
-- Connect pictures for model-bowl-1
INSERT INTO products_pictures (product_id, picture_id) VALUES (7, 31);
INSERT INTO products_pictures (product_id, picture_id) VALUES (7, 32);
INSERT INTO products_pictures (product_id, picture_id) VALUES (7, 33);
INSERT INTO products_pictures (product_id, picture_id) VALUES (7, 34);
INSERT INTO products_pictures (product_id, picture_id) VALUES (7, 35);



-- Add pictures for model-bowl-2
INSERT INTO pictures (id, url) VALUES (36, '/images/categories/bowls/model-bowl-2/model-bowl-2_1.jpg');
INSERT INTO pictures (id, url) VALUES (37, '/images/categories/bowls/model-bowl-2/model-bowl-2_2.jpg');
INSERT INTO pictures (id, url) VALUES (38, '/images/categories/bowls/model-bowl-2/model-bowl-2_3.jpg');
INSERT INTO pictures (id, url) VALUES (39, '/images/categories/bowls/model-bowl-2/model-bowl-2_4.jpg');
-- Add model-bowl-2
INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (8, 'Double Bowl', 'DESCRIPTION', 3, 39.99, 2000, 0);
-- Add model-bowl-2 to bowls
INSERT INTO categories_products (category_id, products_id) VALUES (3, 8);
-- Connect pictures for model-bowl-2
INSERT INTO products_pictures (product_id, picture_id) VALUES (8, 36);
INSERT INTO products_pictures (product_id, picture_id) VALUES (8, 37);
INSERT INTO products_pictures (product_id, picture_id) VALUES (8, 38);
INSERT INTO products_pictures (product_id, picture_id) VALUES (8, 39);



-- Add pictures for model-bowl-3
INSERT INTO pictures (id, url) VALUES (40, '/images/categories/bowls/model-bowl-3/model-bowl-3_1.jpg');
INSERT INTO pictures (id, url) VALUES (41, '/images/categories/bowls/model-bowl-3/model-bowl-3_2.jpg');
INSERT INTO pictures (id, url) VALUES (42, '/images/categories/bowls/model-bowl-3/model-bowl-3_3.jpg');
INSERT INTO pictures (id, url) VALUES (43, '/images/categories/bowls/model-bowl-3/model-bowl-3_4.jpg');
INSERT INTO pictures (id, url) VALUES (44, '/images/categories/bowls/model-bowl-3/model-bowl-3_5.jpg');
-- Add model-bowl-3
INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (9, 'Collapsible dog travel bowl', 'DESCRIPTION', 3, 49.99, 3000, 0);
-- Add model-bowl-3 to bowls
INSERT INTO categories_products (category_id, products_id) VALUES (3, 9);
-- Connect pictures for model-bowl-3
INSERT INTO products_pictures (product_id, picture_id) VALUES (9, 40);
INSERT INTO products_pictures (product_id, picture_id) VALUES (9, 41);
INSERT INTO products_pictures (product_id, picture_id) VALUES (9, 42);
INSERT INTO products_pictures (product_id, picture_id) VALUES (9, 43);
INSERT INTO products_pictures (product_id, picture_id) VALUES (9, 44);



-- Add pictures for model-clothes-1
INSERT INTO pictures (id, url) VALUES (45, '/images/categories/clothes/model-clothes-1/model-clothes-1_1.jpg');
INSERT INTO pictures (id, url) VALUES (46, '/images/categories/clothes/model-clothes-1/model-clothes-1_2.jpg');
INSERT INTO pictures (id, url) VALUES (47, '/images/categories/clothes/model-clothes-1/model-clothes-1_3.jpg');
INSERT INTO pictures (id, url) VALUES (48, '/images/categories/clothes/model-clothes-1/model-clothes-1_4.jpg');
-- Add model-clothes-1
INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (10, 'Collapsible dog travel bowl', 'DESCRIPTION', 4, 49.99, 3000, 0);
-- Add model-clothes-1 to clothes
INSERT INTO categories_products (category_id, products_id) VALUES (4, 10);
-- Connect pictures for model-clothes-1
INSERT INTO products_pictures (product_id, picture_id) VALUES (10, 45);
INSERT INTO products_pictures (product_id, picture_id) VALUES (10, 46);
INSERT INTO products_pictures (product_id, picture_id) VALUES (10, 47);
INSERT INTO products_pictures (product_id, picture_id) VALUES (10, 48);


























# -- Add pictures for model-toy-1
# INSERT INTO pictures (id, url) VALUES (1, '/images/categories/toys/model-toy-1/model-toy-1_1.jpg');
# INSERT INTO pictures (id, url) VALUES (2, '/images/categories/toys/model-toy-1/model-toy-1_2.jpg');
# INSERT INTO pictures (id, url) VALUES (3, '/images/categories/toys/model-toy-1/model-toy-1_3.jpg');
# INSERT INTO pictures (id, url) VALUES (4, '/images/categories/toys/model-toy-1/model-toy-1_4.jpg');
# INSERT INTO pictures (id, url) VALUES (5, '/images/categories/toys/model-toy-1/model-toy-1_5.jpg');
# INSERT INTO pictures (id, url) VALUES (6, '/images/categories/toys/model-toy-1/model-toy-1_6.jpg');
# INSERT INTO pictures (id, url) VALUES (7, '/images/categories/toys/model-toy-1/model-toy-1_7.jpg');
# INSERT INTO pictures (id, url) VALUES (8, '/images/categories/toys/model-toy-1/model-toy-1_8.jpg');
# -- Add model-toy-1 product
# INSERT INTO products (id, name, description, category_id, price, available_quantity, quantity_sold) VALUES (1, 'Dog chewing ball', 'DESCRIPTION', 8, 200, 3000, 1);
# -- Add product3 to category1
# INSERT INTO categories_products (category_id, products_id) VALUES (8, 1);
# -- Add pictures to product3
# INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 15);
# INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 16);
# INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 17);
# INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 18);
# INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 19);

































































-- TEST USER
INSERT INTO users (id, username, email, password, first_name, last_name, gender, age, registration_date_time)
VALUES (1, 'admin', 'admin@admin.com', '', 'Admin', 'Admin', 'MALE', 20, LOCALTIME);

INSERT INTO roles_of_users (role_id, user_id) VALUES (1, 1);






